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
    public ListNode deleteDuplicates(ListNode head) {
       ListNode temp = head;
       
       while(temp != null){
            ListNode pointer1 = temp;
            while(pointer1 != null && temp.val == pointer1.val){
                pointer1 = pointer1.next;
            }

            temp.next = pointer1;
            temp = temp.next; 
       }

       return head;

    }
}
