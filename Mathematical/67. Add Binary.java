class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 && j >= 0){
            char c1 = a.charAt(i);
            char c2 = b.charAt(j);
            
            if(c1 == '1' && c2 =='1'){
                if(carry == 0){
                    ans.append("0");
                }
                else{
                    ans.append("1");
                }
                carry = 1;
            }
            if((c1 == '1' && c2 == '0') || (c1 == '0' && c2 == '1')){
                if(carry == 0){
                    ans.append("1");
                }
                else{
                    ans.append("0");
                    carry = 1;
                }
            }         

            if(c1 == '0' && c2 == '0'){
                if(carry == 0){
                    ans.append("0");
                }
                else{
                    ans.append("1");
                    carry = 0;
                }
            }

            //  System.out.println("ans: " + ans +" carry: " +carry + " i: " + i +" j: " + j);
            i --;
            j --;
        }

       
 
        while(i >= 0){
            if(a.charAt(i) == '0'){
                if(carry == 0){
                    ans.append("0");
                }
                else{
                    ans.append("1");
                    carry = 0;
                }
            }

            if(a.charAt(i) == '1'){
                if(carry == 0){
                    ans.append("1");
                    
                }
                else{
                    ans.append("0");
                    carry = 1;
                }
                
            }
            i --;
        }

        //  System.out.println(ans +"     " +carry);

         while(j >= 0){
            // System.out.println("ans: " + ans +" carry: " +carry + " i: " + i +" j: " + j);
            if(b.charAt(j) == '0'){
                if(carry == 0){
                    ans.append("0");
                }
                else{
                    ans.append("1");
                    carry = 0;
                }
            }

            if(b.charAt(j) == '1'){
                if(carry == 0){
                    ans.append("1");
                }
                else{
                    ans.append("0");
                    carry = 1;
                }
                
            }
            // System.out.println("ans: " + ans +" carry: " +carry + " i: " + i +" j: " + j);
            j --;
        }

        if (carry == 1)ans.append("1");

        return ans.reverse().toString();

    }
}
