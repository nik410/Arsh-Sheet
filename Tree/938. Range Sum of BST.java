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

    public void rangeSumBST1(TreeNode root, int low, int high, int ans[]) {
         if(root == null)return;
        
        if(root.val >= low && root.val <= high)
           ans[0] += root.val;
        rangeSumBST1(root.left, low, high, ans);
        rangeSumBST1(root.right, low, high, ans);
        
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        // int ans[] = {0};

        // rangeSumBST1(root, low, high, ans);

        // return ans[0];

        // Iterative

        int ans = 0;

        Queue<TreeNode> q = new LinkedList();
        q.offer(root);

        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node.val >= low && node.val <= high)ans += node.val;

            if(node.left != null)q.offer(node.left);
            if(node.right != null)q.offer(node.right);
        }

        return ans;

    }
}
