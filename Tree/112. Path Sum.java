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

    class Node{
        TreeNode n;
        int tSum;
        Node(TreeNode n, int tSum){
            this.n = n;
            this.tSum = tSum;
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {  
        // Recursive              
        // if(root == null)return false;
        
        // if(root.left == null && root.right == null){
        //     if(targetSum == root.val)return true;
        //     else return false;
        // }

        // return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);

        // Iterative

        if(root == null)return false;

        Queue<Node> q = new LinkedList();
        q.offer(new Node(root, root.val));

        while(!q.isEmpty()){
            Node temp = q.poll();
           
            if(temp.n.left == null && temp.n.right == null){
                // System.out.println("Node: " + temp.n.val + " tSum: " + temp.tSum);
                if(temp.tSum == targetSum){
                    return true;
                }
            }

            if(temp.n.left != null){
                q.offer(new Node(temp.n.left, temp.tSum + temp.n.left.val));
            }
             if(temp.n.right != null){
                q.offer(new Node(temp.n.right, temp.tSum + temp.n.right.val));
            }
        }

        return false;
    }
}
