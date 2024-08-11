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

    public TreeNode merge(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null)return null;

        int val1 = 0;
        int val2 = 0;
        if(root1 != null)val1 = root1.val;
        if(root2 != null)val2 = root2.val;

        TreeNode root = new TreeNode(val1 + val2);
        
        root.left = merge(root1 != null ? root1.left : null, root2 != null ? root2.left : null);
        root.right = merge(root1 != null ? root1.right : null, root2 != null ? root2.right : null);


        return root;
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        // return merge(root1, root2);

        // Iterative
        // Making changes in any of existing tree

        // if(root1 == null && root2 == null)return null;

        // if(root1 == null || root2 == null) return root1 == null ? root2: root1;

        // Stack<TreeNode> st1 = new Stack();
        // Stack<TreeNode> st2 = new Stack();
        // st1.push(root1);
        // st2.push(root2);

        // while(!st2.isEmpty()){
        //     TreeNode node1 = st1.pop();
        //     TreeNode node2 = st2.pop();

        //     node2.val += node1.val;

        //     if(node2.left == null && node1.left != null){
        //         node2.left = node1.left;
        //     }
        //     else if(node2.left != null && node1.left != null){
        //         st1.push(node1.left);
        //         st2.push(node2.left);
        //     }

        //     if(node2.right == null && node1.right != null){
        //         node2.right = node1.right;
        //     }
        //     else if(node1.right != null && node2.right != null){
        //         st1.push(node1.right);
        //         st2.push(node2.right);
        //     }
        // }
        // return root2;

        // Using BFS that is using queue

        if(root1 == null && root2 == null)return null;

        if(root1 == null || root2 == null)return root1 == null ? root2: root1;

        Queue<TreeNode> q1 = new LinkedList();
        Queue<TreeNode> q2 = new LinkedList();

        q1.offer(root1);
        q2.offer(root2);

        while(!q2.isEmpty()){
            TreeNode n1 = q1.poll();
            TreeNode n2 = q2.poll();

            n2.val += n1.val;

            if(n2.left == null && n1.left != null){
                n2.left = n1.left;
            }
            else if(n2.left != null && n1.left != null){
                q1.offer(n1.left);
                q2.offer(n2.left);
            }

            if(n2.right == null && n1.right != null){
                n2.right = n1.right;
            }
            else if(n1.right != null && n2.right != null){
                q1.offer(n1.right);
                q2.offer(n2.right);
            }
        }


        return root2;
    }
}
