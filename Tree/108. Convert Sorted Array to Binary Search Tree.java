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

    public TreeNode tree(int nums[], int low, int high){
        if(low > high)return null;
        int mid = low + (high - low) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = tree(nums, low, mid - 1);
        root.right = tree(nums, mid + 1, high);
        
        return root;
    }

    class CustomNode{
        TreeNode node;
        int l;
        int r;

        CustomNode(TreeNode node, int l, int r){
            this.node = node;
            this.l = l;
            this.r = r;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        // Recursive Approach
        return tree(nums, 0, nums.length - 1);

        // Iterative Approach
        
    // TreeNode root = new TreeNode(nums[(nums.length - 1) / 2]);
    // Queue<CustomNode> q = new LinkedList<>();
    // q.offer(new CustomNode(root, 0, nums.length - 1));

    // while (!q.isEmpty()) {
    //     CustomNode n = q.poll();
    //     int mid = (n.l + n.r) / 2;

    //     // Left child
    //     if (n.l <= mid - 1) {
    //         int leftMid = (n.l + mid - 1) / 2;
    //         TreeNode lNode = new TreeNode(nums[leftMid]);
    //         n.node.left = lNode;
    //         q.offer(new CustomNode(lNode, n.l, mid - 1));
    //     }

    //     // Right child
    //     if (mid + 1 <= n.r) {
    //         int rightMid = (mid + 1 + n.r) / 2;
    //         TreeNode rNode = new TreeNode(nums[rightMid]);
    //         n.node.right = rNode;
    //         q.offer(new CustomNode(rNode, mid + 1, n.r));
    //     }
    // }

    // return root;
       
    }
}
