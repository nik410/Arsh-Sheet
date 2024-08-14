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

    public int height(TreeNode root){
        if(root == null)return 0;

        int left = height(root.left);
        int right = height(root.right);

        return 1 + Math.max(left, right);
    }

    public boolean isBalanced(TreeNode root) {
        // one naive way to run dfs of each node
        // For left and right of its node and then see if Math.abs(HeightLeft - HeightRight) <= 1
        // If the above |HeiL - HeiR| <= 1 for all the nodes then the answer is true else false

        if(root == null)return true;
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);

        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            int leftH = 0, rightH = 0;

            if(curr.left != null){
                leftH = height(curr.left);
                q.offer(curr.left);
            }

            if(curr.right != null){
                rightH = height(curr.right);
                 q.offer(curr.right);
            }
            System.out.println(curr.val +" curr" + " LeftH:" + leftH + " RightH: "+ rightH);
           if(Math.abs(rightH - leftH) > 1)return false;


        }

        return true;
    }
}
