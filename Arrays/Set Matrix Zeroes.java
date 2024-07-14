
class Solution {
    public void setZeroes(int[][] matrix) {
        // int col0 = 1;

        // int n = matrix.length;
        // int m = matrix[0].length;

        // for(int i = 0; i < n; i ++){
        //     for(int j = 0; j < m; j ++){
        //         if(matrix[i][j] == 0){
        //             matrix[i][0] = 0;
        //             if(j == 0)col0 = 0;
        //             else
        //             matrix[0][j] = 0;
        //         }
        //     }
        // }

        // for(int i = 1; i < n; i ++){
        //     for(int j = 1; j < m; j ++){
        //         if(  matrix[i][0] == 0 || matrix[0][j] == 0){
        //              matrix[i][j] = 0;
        //         }
        //     }
        // }

        // // If 0,0 is 0 then it can be implied that 0th row will all be zero

        // if(matrix[0][0] == 0){
        //     for(int i = 0; i < m; i ++){
        //         matrix[0][i] = 0;
        //     }
        // }
        // if(col0 == 0){
        //      for(int i = 0; i < n; i ++){
        //         matrix[i][0] = 0;
        //     }
        // }

          
          
        // One Way to do it is to store the row and col numbers which have zero and then update it later

        // HashSet<Integer> r = new HashSet();
        // HashSet<Integer> c = new HashSet();

        int n = matrix.length;
        int m = matrix[0].length;

        // for(int i = 0; i < n; i ++){
        //     for(int j = 0; j < m; j ++){
        //         if(matrix[i][j] == 0){
        //             r.add(i);
        //             c.add(j);
        //         }
        //     }
        // }

        //  for(int i = 0; i < n; i ++){
        //     for(int j = 0; j < m; j ++){
        //         if(r.contains(i) || c.contains(j)){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }

        // An optimised approach is to do it in O(1) space 
        // The main crux of that aproach is to use the first row and first col as markers

        int col00 = 1;

        
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++){
               
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j == 0)col00 = 0;
                    else
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < n; i ++){
            for(int j = 1; j < m; j ++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int i = 0; i < m; i ++){
                matrix[0][i] = 0;
            }
        }

        if(col00 == 0){            
             for(int i = 0; i < n; i ++){
                matrix[i][0] = 0;
            }
        }

     }
}class Solution {
    public void setZeroes(int[][] matrix) {
        // int col0 = 1;

        // int n = matrix.length;
        // int m = matrix[0].length;

        // for(int i = 0; i < n; i ++){
        //     for(int j = 0; j < m; j ++){
        //         if(matrix[i][j] == 0){
        //             matrix[i][0] = 0;
        //             if(j == 0)col0 = 0;
        //             else
        //             matrix[0][j] = 0;
        //         }
        //     }
        // }

        // for(int i = 1; i < n; i ++){
        //     for(int j = 1; j < m; j ++){
        //         if(  matrix[i][0] == 0 || matrix[0][j] == 0){
        //              matrix[i][j] = 0;
        //         }
        //     }
        // }

        // // If 0,0 is 0 then it can be implied that 0th row will all be zero

        // if(matrix[0][0] == 0){
        //     for(int i = 0; i < m; i ++){
        //         matrix[0][i] = 0;
        //     }
        // }
        // if(col0 == 0){
        //      for(int i = 0; i < n; i ++){
        //         matrix[i][0] = 0;
        //     }
        // }

          
          
        // One Way to do it is to store the row and col numbers which have zero and then update it later

        // HashSet<Integer> r = new HashSet();
        // HashSet<Integer> c = new HashSet();

        int n = matrix.length;
        int m = matrix[0].length;

        // for(int i = 0; i < n; i ++){
        //     for(int j = 0; j < m; j ++){
        //         if(matrix[i][j] == 0){
        //             r.add(i);
        //             c.add(j);
        //         }
        //     }
        // }

        //  for(int i = 0; i < n; i ++){
        //     for(int j = 0; j < m; j ++){
        //         if(r.contains(i) || c.contains(j)){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }

        // An optimised approach is to do it in O(1) space 
        // The main crux of that aproach is to use the first row and first col as markers

        int col00 = 1;

        
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++){
               
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j == 0)col00 = 0;
                    else
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < n; i ++){
            for(int j = 1; j < m; j ++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int i = 0; i < m; i ++){
                matrix[0][i] = 0;
            }
        }

        if(col00 == 0){            
             for(int i = 0; i < n; i ++){
                matrix[i][0] = 0;
            }
        }

     }
}
