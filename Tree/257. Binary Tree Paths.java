/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public void path(TreeNode root, String s, List<String> al){
        if(root == null)return;

        if(root.left == root.right && root.left == null){
            s += Integer.toString(root.val);
            al.add(new String(s));            
        }       

        path(root.left, s + Integer.toString(root.val) +  "->", al);
        path(root.right, s + Integer.toString(root.val) + "->", al);


    }

    class Node{
        TreeNode n;
        String s;
        Node(TreeNode n, String s){
            this.n = n;
            this.s = s;
        }
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        // List<String> al = new ArrayList();
        // path(root, "", al);

        // return al;

        // Iterative

        // Using Queue ie BFS or Level Order Traversal

        // List<String> al = new ArrayList();

        // Queue<Node> q = new LinkedList();
        // q.offer(new Node(root, Integer.toString(root.val) + "->"));

        // while(!q.isEmpty()){
        //     Node temp = q.poll();

        //     if(temp.n.left == temp.n.right && temp.n.left == null){
        //         String path = temp.s.substring(0, temp.s.length() - 2);
        //         al.add(path);
        //     }

        //     if(temp.n.left != null){
        //         q.offer(new Node(temp.n.left, temp.s + Integer.toString(temp.n.left.val) + "->"));
        //     }
        //     if(temp.n.right != null){
        //         q.offer(new Node(temp.n.right, temp.s +Integer.toString(temp.n.right.val) + "->"));
        //     }
        // }

        // return al;

        // Using Stack DFS

        List<String> al = new ArrayList();

        Stack<Node> st = new Stack();
        st.push(new Node(root, Integer.toString(root.val) +"->"));

        while(!st.isEmpty()){
            Node temp = st.pop();

            if(temp.n.left == temp.n.right && temp.n.left == null){
                String path = temp.s.substring(0, temp.s.length() - 2);
                al.add(path);
            }

            if(temp.n.left != null){
                st.push(new Node(temp.n.left, temp.s + Integer.toString(temp.n.left.val) + "->"));
            }
             if(temp.n.right != null){
                st.push(new Node(temp.n.right, temp.s + Integer.toString(temp.n.right.val) + "->"));
            }
        }

        return al;

    }
}
