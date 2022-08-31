package Problems.SpiralMatrix;

/*
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
 */

public class SpiralMatrixMain {
    public static void main(String[] args){
        SpiralMatrixSol sol = new SpiralMatrixSol();
        int[][] spiralMatrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(sol.spiralOrder(spiralMatrix));
    }
}
