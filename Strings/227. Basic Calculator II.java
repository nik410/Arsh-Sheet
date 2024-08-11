class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack();
        s = new String(s) + "+";
        int num = 0;
        char op = '+';
        for(int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = num * 10 + (int)(c - '0');
                continue;
            }
            if(c == ' ')continue;

            if(op == '+')st.push(num);
            else if(op == '-')st.push(-1 * num);
            else if(op == '*')st.push(st.pop() * num);
            else {
                st.push(st.pop() / num);
            }
            op = c;
            num = 0;    
        }

        int ans = 0;
        while(!st.isEmpty()){
            ans += st.pop();
        }

        return ans;
    }
}
