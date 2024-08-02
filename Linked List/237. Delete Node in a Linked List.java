/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        // ListNode nextNode = node.next;

        // //Swapping the values 

        // int temp = node.val;
        // node.val = nextNode.val;
        // nextNode.val = temp;

        // // Deleting the nextNode which now cnotains the node val

        // node.next = nextNode.next;

        // As specified in the question the given node to be deleted is not tail node

        node.val = node.next.val;
        node.next = node.next.next;

        
        
    }
}
