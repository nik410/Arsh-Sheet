class Solution {
    public int strStr(String haystack, String needle) {
        //The first approach to solve the problem is to run too loops
        for(int i = 0; i <= haystack.length() - needle.length(); i ++){
            int c = 0;
            int k = i;
            for(int j = 0; j < needle.length(); j ++){  
                if(k <= haystack.length() && haystack.charAt(k) == needle.charAt(j)){
                    c ++;
                    k ++;
                }
                else{
                    break;
                }                
            }
            if(c == needle.length())return i;
        }
        
        return -1;

        // Optimal way would be to use string searching algo like kmp, horsepool algo
    }
}
