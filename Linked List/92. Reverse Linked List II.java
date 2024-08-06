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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        // if(left == right)return head;
        // ListNode nodeBF = null;
        // ListNode curr = head;
        // ListNode prev = null;
        // int counter = 0;
        // while(curr != null && counter + 1 != left){
        //     nodeBF = curr;
        //     curr = curr.next;
        //     counter ++;
        // }
        
        // ListNode pointR = null;
        // if(nodeBF != null)pointR = nodeBF.next;
        // ListNode endP = null;

        // ListNode afterR = null;
        
        // if(nodeBF != null)
        // nodeBF.next = null;

        // curr = pointR;

        
        // prev = null;

        // while(curr != null && counter != right){
        //     if(counter == right){
        //         endP = curr.next;   
        //         if(endP != null)  afterR = endP.next;        
        //     }
        //     ListNode nextCurr = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = nextCurr;
        //     afterR = nextCurr;
        //     counter ++;
        // }
        // if(nodeBF != null)
        // nodeBF.next = prev;
        // else{
        //     head = prev;
        // }        

        // if(pointR != null){
        //     pointR.next = curr;
        // }

        // return head;

        ListNode dummy = new ListNode(-7);        
        dummy.next = head;
        ListNode prev = dummy;

        for(int i = 0 ; i < left - 1; i ++){
            prev = prev.next;
        }

        ListNode curr = prev.next;
        

         for(int i = left; i < right; i ++){
            ListNode nextCurr = curr.next;
            curr.next = nextCurr.next;
            nextCurr.next = prev.next;
            prev.next = nextCurr;
        }

        return dummy.next;        
    }
}
