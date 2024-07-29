class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
       
        int temp = columnNumber;
        while(temp > 0){
            temp --;
            int rem = temp % 26;           
            ans.append((char)('A' + rem));           
            temp /= 26;
        }


        return ans.reverse().toString();
    }
}
