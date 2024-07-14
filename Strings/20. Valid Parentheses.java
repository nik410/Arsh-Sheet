class Solution {
    public boolean isValid(String s) {
        

        Stack<Character> st = new Stack();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }
            else{
                if(c ==')'){
                    if(!st.isEmpty() && st.peek() == '('){
                        st.pop();
                    }
                      else{
                        return false;

                    }
                }

                if(c =='}'){
                    if(!st.isEmpty() && st.peek() == '{'){
                        st.pop();
                    }
                      else{
                       return false;
                    }
                }
                if(c ==']'){
                    if(!st.isEmpty() && st.peek() == '['){
                        st.pop();
                    }
                    else{
                       return false;
                    }
                }
            }
        }

        return st.size() > 0 ? false: true;
    }
}
