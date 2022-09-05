package Problems.BestTimeStock;

class BestTimeStockSol {
    public int maxProfit(int[] prices) {
        /*
            Constraints:

            1 <= prices.length <= 3 * 10^4
            0 <= prices[i] <= 10^4
         */
        if (prices.length < 1 || prices.length > 30000){
            return -1;
        }

        for (int i = 0; i < prices.length; i++){
            if (prices[i] < 0 || prices[i] > 10000){
                return -1;
            }
        }

        // First we check if the prices are in descending order
        // such that there is no profit to be made
        boolean descending = true;

        for (int i = 1; i < prices.length; i++){
            if (prices[i] > prices[i-1]){
                descending = false;
                break;
            }
        }

        int buyingDate = 0, sellingDate = 0, profit = 0;
        for(int i = 1; i < prices.length;i++){
            if(prices[i] >= prices[i-1]){
                sellingDate++;
            }else{
                profit += prices[sellingDate] -  prices[buyingDate];
                buyingDate = sellingDate = i;
            }
        }
        profit += prices[sellingDate] -  prices[buyingDate];
        return profit;

    }
}
