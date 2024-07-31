/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        // ListNode slow = head;
        // ListNode fast = head;

        // while(fast != null && fast.next != null){
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }

        // return slow;



        ListNode slow = head;
        ListNode fast = head;

        // The fast == null helps us in case of even length ll and fat.next == null in odd length
        // The order in which we write the condition is important as it can cause NullPointerException
        // If fast is null but we want to access fast.next it will throw NullPointerException
         
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
        
    }
}
