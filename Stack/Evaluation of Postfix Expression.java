class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        int ans = 0;
        Stack<Integer> st1 = new Stack();
        
        
        for(int i = 0; i < S.length(); i ++){
            char c = S.charAt(i);
            
            if(Character.isDigit(c)){
                int num = c - '0';
                st1.push(num);
            }
            else{
                
                int num1 = st1.pop();
                int num2 = st1.pop();
                
                if(c == '-'){
                    int sub = num2 - num1;
                    st1.push(sub);
                }
                
                if(c == '*'){
                    int mul = num1 * num2;
                    st1.push(mul);
                }
                if(c == '+'){
                    int sum = num1 + num2;
                    st1.push(sum);
                }if(c == '/'){
                    int div = num2 / num1;
                    st1.push(div);
                }
                
            }
        }
        
        return st1.pop();
    }
}
