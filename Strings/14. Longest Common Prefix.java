class Solution {
    public String longestCommonPrefix(String[] strs) {
        // One approach is to sort the string array and compare first and last string

        Arrays.sort(strs);

        String a = strs[0], b = strs[strs.length - 1];
        String common = "";
        for(int i = 0; i < Math.min(a.length(), b.length()); i ++){
            if(a.charAt(i) == b.charAt(i)){
                common += a.charAt(i) + "";
            }
            else{
                break;
            }
        }

        return common;


        //Other way is to use a special data structure called Trie.
    }
}
