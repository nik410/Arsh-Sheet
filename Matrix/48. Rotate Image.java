class Solution {
    public void rotate(int[][] matrix) {
        
        // for(int i = 0; i < matrix.length / 2; i ++){
        //     for(int j = 0; j < matrix[0].length; j ++){
                
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[matrix.length - 1 - i][j];
        //         matrix[matrix.length - 1 - i][j] = temp;   
        //     }           
        // }

        // for(int i = 0; i < matrix.length; i ++){
        //     for(int j = i + 1; j < matrix[0].length; j ++){
                
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[j][i];
        //         matrix[j][i] = temp;   
        //     }           
        // }

        // for(int i = 0 ; i < matrix.length / 2; i ++){
        //     for(int j = 0; j < matrix[0].length; j ++){
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[matrix.length - 1 - i][j];
        //         matrix[matrix.length - 1 - i][j] = temp;
        //     }
        // }

        // for(int i = 0; i < matrix.length; i ++){
        //     for(int j = i + 1; j < matrix[0].length; j ++){
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[j][i];
        //         matrix[j][i] = temp;
        //     }
        // }

        int r = matrix.length;
        int c = matrix[0].length;

        for(int i = 0; i < r/2; i ++){
            for(int j = 0; j < c; j ++){
                int temp = matrix[r - 1 - i][j];
                matrix[r - 1 - i][j] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }


        for(int i = 0; i < r; i ++){
            for(int j = i + 1; j < c; j ++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
