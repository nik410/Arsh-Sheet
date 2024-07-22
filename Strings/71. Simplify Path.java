class Solution {
    public String simplifyPath(String path) {
        // Stack<String> st = new Stack();

        // for(int i = 0; i < path.length(); i++){
        //    char c = path.charAt(i);
        //    if(c == '/'){
        //        continue;
        //    }
        //    String temp = "";
        //     while(i < path.length() && path.charAt(i) != '/'){
        //         temp += path.charAt(i);
        //         ++i;
        //     }
        //     if(temp.equals("."))continue;
        //     else if(temp.equals("..")){
        //         if(!st.isEmpty()){
        //             st.pop();
        //         }
        //     }
        //     else st.push(temp);
        // }
        
                
        // StringBuilder stb = new StringBuilder("/");
        // for(String s: st){
        //     stb.append(s);
        //     stb.append("/");
        // }
        // stb.delete(stb.length() - 1, stb.length());
        // if(stb.length() == 0)stb.append('/');

        // return stb.toString();

        Stack<String> st = new Stack();

        for(int i = 0; i < path.length(); i ++){
            char c = path.charAt(i);
            if(c == '/'){
                continue;
            }
            String fileName = "";
            int j = i;
            while(j < path.length() && path.charAt(j) != '/'){
                fileName += path.charAt(j) + "";
                j ++;
            }

            if(fileName.equals("."))continue;

            if(fileName.equals("..") ){
                if(!st.isEmpty())
                st.pop();
                continue;
            }
                       
            st.push(fileName);

             i = j;

        }

        if(st.isEmpty())return "/";       

        String ans = "/";

        for(String s: st){
            ans += "" + s +"/";
        }

        ans = ans.substring(0, ans.length() - 1);
        
        System.out.println(st);

        return ans;

        
    }
}
