package Problems.RottingOranges;

/*
    You are given an m x n grid where each cell can have one of three values:

    0 representing an empty cell,
    1 representing a fresh orange, or
    2 representing a rotten orange.
    Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

    Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

    Ex:
    Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
    Output: 4
 */

public class RottingOrangesMain {
    public static void main(String[] args){
        // object init
        RottingOrangesSol oranges = new RottingOrangesSol();

        // m x n grid of empty cells (0) / fresh oranges (1) / rotten oranges (2)
        int[][] grid = new int[][]{
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        // print the min number of mins until no cell has a fresh orange
        System.out.println(oranges.orangesRotting(grid));
    }
}
