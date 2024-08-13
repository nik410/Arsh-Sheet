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
    public ListNode partition(ListNode head, int x) {              
        ListNode small = new ListNode(-1), large = new ListNode(-1);
        ListNode pntSmall = small, pntLarge = large;

        ListNode temp = head;

        while(temp != null){
            if(temp.val < x){
                small.next = temp;
                small = small.next;
            }
            else if( temp.val >= x){
                large.next = temp;
                large = large.next;
            }

            ListNode nextNode = temp.next;
            temp.next = null;

            temp = nextNode;
        }

        small.next = pntLarge.next;

        return pntSmall.next;


        // return null;

    }
}
