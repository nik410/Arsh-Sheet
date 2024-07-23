class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack();

        for(int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            if(c == ' ')continue;
            String word = "";
            int j = i;
            while(j < s.length() && s.charAt(j) != ' '){
                word += "" + s.charAt(j);
                j ++;
            }
            st.push(word);
            i = j;
        }
        System.out.println(st);

        String ans = "";

        while(st.size() > 1){
            ans += st.pop() + " ";
        }

        ans += st.pop();

        return ans;
    }
}
