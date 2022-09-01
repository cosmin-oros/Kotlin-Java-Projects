package Problems.NumberOfIslands;

class IslandsSol {
    public int numIslands(char[][] grid) {
        int res = 0;
        int m = grid.length, n = grid[0].length;
        // traverse grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    dfs(grid, i, j);
                }
            }
        }
        return res;
    }

    // change 1 to 0 from (i, j)
    public void dfs(char[][] grid, int i, int j) {
        int m = grid.length, n = grid[0].length;
        // edge
        if (i < 0 || j < 0 || i >= m || j >= n) return;
        // water
        if (grid[i][j] == '0') return;
        grid[i][j] = '0';

        dfs(grid, i+1, j);
        dfs(grid, i, j+1);
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);
    }
}
