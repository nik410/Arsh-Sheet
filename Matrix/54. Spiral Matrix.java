
import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<Integer> spiralPathMatrix(int[][] matrix , int n ,int m){
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        ArrayList<Integer> ans = new ArrayList<>();

        while(ans.size() != n * m){
            
            // Left to right 

            for(int i = left; i <= right; i ++){
                ans.add(matrix[top][i]);
            }
            top ++;           
           

            // Top to Bottom

            

            for(int i = top; i <= bottom; i ++){
                ans.add(matrix[i][right]);
            }
            right --;        

           

            // Right to Left

           if(top <= bottom){

                for(int i = right; i >= left; i --){
                    ans.add(matrix[bottom][i]);
                }
                bottom --;
           }           

            // Bottom to Top

           
            if(left <= right){
                for(int i = bottom; i >= top; i --){
                    ans.add(matrix[i][left]);
                }
                
                left ++;
            }
        }

        return ans;
    }
}
