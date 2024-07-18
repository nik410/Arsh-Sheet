class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        int nonMatch = 0;
        int flag1 = 0;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                nonMatch ++;
                l ++;
                if(nonMatch > 1){
                    flag1 = 1;
                    break;
                }
            }
            else{
                l ++;
                r --;
            }

        }       

        if(nonMatch == 0)return true;
        int flag2 = 0;
        l = 0; r = s.length() - 1;
        int nonMatch2 = 0;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                nonMatch2 ++;
                r --;
                if(nonMatch2 > 1){
                    flag2 = 1;
                    break;
                }
            }
            else{
                l ++;
                r --;
            }

        }

        if(nonMatch == 1 || nonMatch2 <= 1)return true;
        else{
            return false;
        }

    }
}
