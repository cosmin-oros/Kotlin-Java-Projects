package Problems.MaximalSquare;

class MaximalSquareSol {
    public int maximalSquare(char[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] dp = new int[rows + 1][columns + 1];
        int maxsqlen = 0;

        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= columns; j++){
                if (matrix[i-1][j-1] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
                    maxsqlen = Math.max(maxsqlen, dp[i][j]);
                }
            }
        }

        return maxsqlen * maxsqlen;
    }
}
