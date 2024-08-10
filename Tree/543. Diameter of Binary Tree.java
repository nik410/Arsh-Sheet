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

    public int d(TreeNode root, int arr[]){
        if(root == null)return 0;

        int l = d(root.left, arr);
        int r = d(root.right, arr);

        arr[0] = Math.max(arr[0], 1 + l + r);

        return Math.max(l, r) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int arr[] = {0};
        d(root, arr);

        return arr[0] - 1;

        // Iteratively we can solve it using postOrder iterative approach 
    }
}
