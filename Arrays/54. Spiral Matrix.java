class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // int right = 0;
        // int left = matrix[0].length - 1;
        // int up = 0;
        // int bottom = matrix.length - 1;

        // List<Integer> al = new ArrayList();

        // while(al.size() != (matrix[0].length * matrix.length)){
            
        //     //right to left 

        //     for(int i = right; i <= left; i++){
        //         al.add(matrix[up][i]);
        //     }
        //     up ++;

        //      if(al.size() == (matrix[0].length * matrix.length))break;

        //     //System.out.println(al + "Right to Left");

        //     //Up to down

        //     for(int i = up; i <= bottom; i ++){
        //         al.add(matrix[i][left]);
        //     }
        //     left --;

        //      if(al.size() == (matrix[0].length * matrix.length))break;

        //    // System.out.println(al + "Up to Down");

        //     // Left to right

        //      for(int i = left; i >= right; i --){
        //         al.add(matrix[bottom][i]);
        //     }
        //     bottom --;

        //      if(al.size() == (matrix[0].length * matrix.length))break;
        //     //System.out.println(al + "Left to Right");

        //     // Bottom to Up

        //     for(int i = bottom; i >= up; i --){
        //         al.add(matrix[i][right]);
        //     }
        //     right ++;

        //     if(al.size() == (matrix[0].length * matrix.length))break;
        //    //System.out.println(al + "Bottom to Left");
        // }

        // return al;

        // Usage of four pointers to simulate the diiferent types of traversals
        
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int down = matrix.length - 1;

        ArrayList<Integer> al = new ArrayList();

        while(al.size() != matrix.length * matrix[0].length){
            // From left to right 

            for(int i = left; i <= right; i ++){
                al.add(matrix[top][i]);
            }

            top ++;

            // if(al.size() == (matrix[0].length * matrix.length))break;

            //Up to down

            for(int i = top; i <= down; i ++){
                al.add(matrix[i][right]);
            }
            right --;

            // if(al.size() == (matrix[0].length * matrix.length))break;

            // Right to left
            if(top <= down){
            for(int i = right; i >= left; i --){
                al.add(matrix[down][i]);
            }
            down --;}

            // if(al.size() == (matrix[0].length * matrix.length))break;

            // Down to up
            if(left <= right){
            for(int i = down; i >= top; i --){
                al.add(matrix[i][left]);
            }
            left ++;}

            // if(al.size() == (matrix[0].length * matrix.length))break;

        }

        return al;
    }
}
