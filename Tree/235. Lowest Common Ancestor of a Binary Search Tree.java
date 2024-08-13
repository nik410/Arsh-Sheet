/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // int max = Math.max(p.val, q.val);
        // int min = Math.min(p.val, q.val);

        // while(root != null){
        //     if(root.val > max){
        //         root = root.left;
        //     }
        //     else if(root.val < min){
        //         root = root.right;
        //     }
        //     else {  //if(root.val <=max && root.val >= min)
        //         return root;
        //     }
        // }

        // return null;

        int max = Math.max(p.val, q.val);
        int min = Math.min(p.val, q.val);

        TreeNode t = root;

        while(t != null){
            if(t.val > max){
                t = t.left;
            }
            else if(t.val < min){
                t = t.right;
            }
            else if(t.val >= min && t.val <= max){
                return t;
            }
        }

        return null;
    }
}
