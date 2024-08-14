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

    //Approach 1
    int sum(TreeNode root, TreeNode parent){
        if(root == null) return 0;

        if(root.left == null && root.right == null){
            if(parent!= null && parent.left == root){
                return root.val;
            }
            return 0;
        }

        int left = sum(root.left, root);
        int right = sum(root.right, root);

         return left + right;
    }

    //Approach 2 using a boolean to check isLeft is true or not

    int sumL(TreeNode root, boolean isLeft){
        if(root == null)return 0;

        if(root.left == null && root.right == null && isLeft == true)return root.val;

        int left = sumL(root.left, true);
        int right = sumL(root.right, false);

        return left + right;
    }

    public int sumOfLeftLeaves(TreeNode root) {
        //return sum(root, null);

        // return sumL(root, false);

        // return leftS(root, false);

        // Using Queue

        Queue<Node> q = new LinkedList();

        int ans = 0;

        q.offer(new Node(root, false));

        while(!q.isEmpty()){
            Node temp = q.poll();

            if(temp.t.left == temp.t.right && temp.t.left == null){
                if(temp.isLeft == true){
                    ans += temp.t.val;
                }
            }

            if(temp.t.left != null){
                q.offer(new Node(temp.t.left, true));
            }

            if(temp.t.right != null){
                q.offer(new Node(temp.t.right, false));
            }
            
        }

        return ans;

    }

    class Node{
        TreeNode t;
        boolean isLeft;

        Node(TreeNode t, boolean isLeft){
            this.t = t;
            this.isLeft = isLeft;
        }
    }

    public int leftS(TreeNode root, boolean isLeft){
        if(root == null)return 0;

        if(root.left == root.right && root.left == null && isLeft == true){
            return root.val;
        }

        int left = leftS(root.left, true);
        int right = leftS(root.right, false);

        return left + right;
    }
}
