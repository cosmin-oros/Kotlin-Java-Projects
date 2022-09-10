package Problems.RottingOranges;

import java.util.LinkedList;
import java.util.Queue;

class RottingOrangesSol {
    class Pair{
        int i, j;
        public Pair(int i, int j){
            this.i = i;
            this.j = j;
        }
    }

    int N, M;
    int [] row = new int[]{0, 0, -1, +1};
    int [] col = new int[]{-1, +1, 0, 0};

    public int orangesRotting(int[][] grid) {
        N = grid.length;
        M = grid[0].length;

        int fresh = 0;

        Queue<Pair> q = new LinkedList();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(grid[i][j] == 2){
                    q.offer(new Pair(i, j));
                } else if(grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        Pair curr;
        int ans = 0;

        while(!q.isEmpty() && fresh != 0){
            ans++;
            int size = q.size();

            for(int i = 0; i < size; i++){
                curr = q.poll();

                for(int k = 0; k < 4; k++){
                    int x = curr.i + row[k];
                    int y = curr.j + col[k];
                    if(x < 0 || x >= N || y < 0 || y >= M || grid[x][y] != 1) {
                        continue;
                    }

                    grid[x][y] = 2;
                    q.offer(new Pair(x, y));
                    fresh--;
                }
            }
        }

        return fresh == 0 ? ans : -1;

    }
}
