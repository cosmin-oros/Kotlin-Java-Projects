package Problems.SurroundedRegions;

class SurroundedRegionsSol {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        //Approach :
        // 1. Explore all the 4 borders and replace all the cells with O's and all the adjacent cells which are O's to N
        //2. N basically indicates that these cells can't be flipped from O to X
        //3. Finally Traverse the entire board to replace all N's to O's (i.e because these cells can't be flipped from O to X) and the remaining cells to X's (i.e  these cells can be flipped from O to X);
        //The Top Border
        for(int col=0;col<n;col++){
            dfs(board,0,col,m,n);
        }
        //The Bottom Border
        for(int col=0;col<n;col++){
            dfs(board,m-1,col,m,n);
        }
        //The left Border
        for(int row=0;row<m;row++){
            dfs(board,row,0,m,n);
        }
        //The right Border
        for(int row=0;row<m;row++){
            dfs(board,row,n-1,m,n);
        }
        for(int row = 0; row<m; row++){
            for(int col = 0; col<n;col++){
                if(board[row][col] == 'N'){
                    board[row][col] = 'O';
                }
                else{
                    board[row][col] = 'X';
                }
            }
        }
    }
    public void dfs(char[][] board,int row,int col,int m,int n){
        if(!isSafe(row,col,m,n) || board[row][col] != 'O'){
            return;
        }
        board[row][col] = 'N';
        dfs(board,row,col-1,m,n);
        dfs(board,row,col+1,m,n);
        dfs(board,row-1,col,m,n);
        dfs(board,row+1,col,m,n);
    }
    public boolean isSafe(int row,int col,int m,int n){
        return (row>=0 && row<m && col>=0 && col<n);
    }
}
