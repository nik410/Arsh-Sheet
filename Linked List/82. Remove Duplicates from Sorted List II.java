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
        ListNode dummy = new ListNode(-169);
        ListNode ans = dummy;

        ListNode temp = head;

        while(temp != null){
            
            ListNode nextToCurr = null;
            if(temp.next != null){
                nextToCurr = temp.next;
            }
            int dup = 0;
            while(nextToCurr != null && temp.val == nextToCurr.val){
                nextToCurr = nextToCurr.next;
                dup ++;
            }

            if(dup == 0){
                ans.next = temp;
                ans = ans.next;
                temp = temp.next;
            }
            else{
                temp = nextToCurr;
                if(temp == null){
                    ans.next = null;
                }
            }
        }


        return dummy.next;
    }
}
