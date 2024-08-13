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

    public void inorder(TreeNode root, ArrayList<Integer> list){
        if(root == null)return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public int getMinimumDifference(TreeNode root) {
        // The crux of the question is to use inorder traversal as inorder traversal gives sorted list
        ArrayList<Integer> list = new ArrayList();
        inorder(root, list);

        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i < list.size() - 1; i ++){
            minDiff = Math.min(minDiff, list.get(i + 1) - list.get(i));
        }

        return minDiff;

    }
}
