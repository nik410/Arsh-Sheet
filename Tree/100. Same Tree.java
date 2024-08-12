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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // if(p == q && p == null)return true;

        // if(p == null || q == null)return false;
        // if(p.val != q.val)return false;

        // return isSameTree(p.left, q.left) & isSameTree(p.right, q.right); 

        // Iterative

        if(p == q && p == null)return true;
        if(p == null || q == null)return false;

        if(p.val != q.val)return false;

        Stack<TreeNode> st1 = new Stack();
        Stack<TreeNode> st2 = new Stack();

        st1.push(p);
        st2.push(q);

        while(!st1.isEmpty()){
            TreeNode t1 = null;
            TreeNode t2 = null;
            if(st1.size() > 0)t1 = st1.pop();
            if(st2.size() > 0)t2 = st2.pop();

            if(t1 == null && t2 == null){
                continue;
            }
            else if((t1 == null && t2 != null) || (t2 == null && t1 != null))return false;
           
            else if(t1.left != null && t2.left != null){
                 if(t1.left.val != t2.left.val)return false;
                st1.push(t1.left);
                st2.push(t2.left);
            }
             else if((t1.left == null && t2.left != null) || (t2.left == null && t1.left != null)){
                return false;
            }

            if(t1.right != null && t2.right != null){
                if(t1.right.val != t2.right.val)return false;
                st1.push(t1.right);
                st2.push(t2.right);
            }
           

            else if((t1.right == null && t2.right != null) || (t2.right == null && t1.right != null)){
                return false;
            }

        }

        if(st1.isEmpty() && st2.isEmpty())
        return true;

        return false;



    }
}
