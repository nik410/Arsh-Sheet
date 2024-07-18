class Solution {
    
    // public static void ways(int n, List<String> ans, StringBuilder stb, int count1, int count2){
        
    //     if(stb.length() == 2 * n){
    //         if(count1 == count2){
    //             ans.add(stb.toString());
    //             stb = new StringBuilder();
    //         }            
    //         return;
    //     }

    //         if(count1 < n){
    //           stb.append("(");
    //             count1 += 1;
    //             ways(n, ans, stb, count1, count2);
    //             if(stb.length() > 0){
    //                 stb.deleteCharAt(stb.length() - 1);
    //                 count1 -= 1;
    //             }
    //          }   


    //             if(count1 > count2 && count2 < n){
    //             stb.append(")");
    //             count2 += 1;
    //             ways(n, ans, stb, count1, count2);
    //             if(stb.length() > 0){
    //                 stb.deleteCharAt(stb.length() - 1);
    //                 count2 -= 1;
    //                 }
    //             }    
        


    // }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        // StringBuilder stb = new StringBuilder();
        generate(n, "", 0 , 0, ans);

        return ans;
    }

    public void generate(int n, String curr, int openBracket, int closeBracket, List<String> ans){
        if(curr.length() == 2 * n){
            if(openBracket == closeBracket){
                ans.add(curr);
            }
            return;
        }

        if(openBracket < n){
            curr += "(";
            generate(n, curr, openBracket + 1, closeBracket, ans);
            curr = curr.substring(0, curr.length() - 1);
        }

        if(closeBracket < openBracket){
            curr += ")";
            generate(n, curr, openBracket, closeBracket + 1, ans);
            curr = curr.substring(0, curr.length() - 1);
        }
    }

}
