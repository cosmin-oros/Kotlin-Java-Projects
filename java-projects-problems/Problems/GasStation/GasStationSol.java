package Problems.GasStation;

class GasStationSol {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int countGas = 0;
        int countCost = 0;
        int diff = 0;
        int minDiff = 10001;
        int ind = 0;

        for (int i = 0; i < gas.length; i++){
            countGas += gas[i];
            countCost += cost[i];
            diff += gas[i] - cost[i];
            if (minDiff > diff){
                minDiff = Math.min(diff, minDiff);
                ind = i;
            }
        }

        if (countGas < countCost){
            return -1;
        }
        return (ind == gas.length-1) ? 0 : ind+1;
    }
}
