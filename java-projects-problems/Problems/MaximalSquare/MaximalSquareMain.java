package Problems.MaximalSquare;

/*
    Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

    Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
    Output: 4
 */

public class MaximalSquareMain {
    public static void main(String[] args){
        MaximalSquareSol square = new MaximalSquareSol();
        char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };

        System.out.println(square.maximalSquare(matrix));
    }
}
