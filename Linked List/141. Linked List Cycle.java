/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        // if(head == null)return false;

        // ListNode slow = head;
        // ListNode fast = head;

        // while(fast.next != null && fast.next.next != null){
        //     slow = slow.next;
        //     fast = fast.next.next;

        //     if(slow == fast)return true;
        // }

        // return false;

        // Bruteforce way would be to make a hashset can store node one by one it a node
        // is already present in the hashset we return true else false

        // Using Flyod's cycle detection algo or Tortoise hare algo

        if(head == null)return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)return true;

        }

        return false;
    }
}
