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
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null || head.next.next == null)return head;

        ListNode odd = head;
        ListNode dummyOdd = odd;
        ListNode eve = head.next;
        ListNode dummyEve = eve;

        while(odd.next != null && eve.next != null ){
            ListNode nextOfEve = eve.next;          

            odd.next = null;
            odd.next = nextOfEve;
            odd = odd.next;
            
            ListNode nextOfOdd = odd.next;

            eve.next = null;
            eve.next = nextOfOdd;
            eve = eve.next;
        }     

        odd.next = dummyEve;  

        return dummyOdd;
    }

}
