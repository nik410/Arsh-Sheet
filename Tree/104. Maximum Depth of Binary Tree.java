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
    public int maxDepth(TreeNode root) {
        // if(root == null)return 0;

        // int left = maxDepth(root.left);
        // int right = maxDepth(root.right);

        // return 1 + Math.max(left, right); 

        // Iterative

        // Using Queue Level Order Traversal

        // if(root == null)return 0;

        // Queue<TreeNode> q = new LinkedList();
        // q.offer(root);
        // int level = 1;

        // while(!q.isEmpty()){
        //     int siz = q.size();

        //     for(int i = 0; i < siz; i ++){
        //         TreeNode temp = q.poll();

        //         if(temp.left != null)q.offer(temp.left);
        //         if(temp.right != null)q.offer(temp.right);
        //     }
        //     level ++;
        // }

        // return level - 1;

        // Using stack which is DFS

        if(root == null)return 0;

        Stack<Node> st = new Stack();
        st.push(new Node(root, 1));

        int ans = 0;

        while(!st.isEmpty()){
            Node nod = st.pop();
            ans = Math.max(ans, nod.level);
            if(nod.n.left != null){
                st.push(new Node(nod.n.left, nod.level + 1));                
            }
            if(nod.n.right != null){
                st.push(new Node(nod.n.right, nod.level + 1));
            }
        }

        return ans; 

    }

    class Node{
        TreeNode n;
        int level;
        Node(TreeNode n, int level){
            this.n = n;
            this.level = level;
        }
    } 
}
