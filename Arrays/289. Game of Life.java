
class Solution {

    public boolean inBound(int newX, int newY, int n, int m){
        if(newX < 0 || newX >= n || newY < 0 || newY >= m)return false;
        else
        return true;
    }

    public void gameOfLife(int[][] board) {
        // int directions[][] = {
        //     {-1, 0},
        //     {1, 0},
        //     {0, -1},
        //     {0, 1},
        //     {1, 1},
        //     {1, -1},
        //     {-1, 1},
        //     {-1, -1}
        // };
        
        // int n = board.length;
        // int m = board[0].length; 
        
        // for(int i = 0; i < n; i ++){
        //     for(int j = 0; j < m; j ++){
                
        //         int liveNeigh = 0;

        //         for(int direc[]: directions){
        //             int newX = i + direc[0];
        //             int newY = j + direc[1];

        //             if(inBound(newX, newY, n, m) && (board[newX][newY] == 1 || board[newX][newY] == 100)){
        //                 liveNeigh ++;
        //             }
        //         }

        //         // if the (i, j) cell is 

        //         if(board[i][j] == 1){
        //             if(liveNeigh > 3 || liveNeigh < 2){
        //                 board[i][j] = 100;
        //             }
        //         }

        //         if(board[i][j] == 0){
        //             if(liveNeigh == 3){
        //                 board[i][j] = 20;
        //             }
        //         }


        //     }
        // }


        // for(int i = 0; i < n; i ++){
        //     for(int j = 0; j < m; j ++){
        //         if(board[i][j] == 100)board[i][j] = 0;
        //         if(board[i][j] == 20)board[i][j] = 1;
        //     }
        // }

        int direc[][] = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, 1}, {1, -1}, {1, 1}, {-1, -1}
        };

        int r = board.length;
        int c = board[0].length;

        for(int i = 0; i < r; i ++){
            for(int j = 0; j < c; j ++){
                
                int liveNeig = 0;

                for(int neigh[]: direc){
                    int newX = i + neigh[0];
                    int newY = j + neigh[1];

                    if(newX >= 0 && newX < r && newY >= 0 && newY < c){
                        if(board[newX][newY] == 1 || board[newX][newY] == 200)liveNeig ++;
                    }
                }

                if(board[i][j] == 0){
                    if(liveNeig == 3){
                        board[i][j] = -200;
                    }
                }
                
                if(board[i][j] == 1){
                    if(liveNeig < 2 || liveNeig > 3){
                        board[i][j] = 200;
                    }
                }

            }
        }


        for(int i = 0; i < r; i ++){
            for(int j = 0 ; j < c; j ++){
                if(board[i][j] == -200)board[i][j] = 1;
                if(board[i][j] == 200)board[i][j] = 0;
            }
        }




    }
}
