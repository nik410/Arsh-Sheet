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

    // public static ListNode reverse(ListNode curr, ListNode prev, ListNode nextNode){
    //     if(curr == null){
    //         return prev;
    //     }
    //     else{
    //         nextNode = curr.next;
    //         curr.next = prev;
    //         return reverse(nextNode, curr, null);
    //     }
    // }

    public ListNode reverseList(ListNode head) {
        // return reverse(head, null, null);

        // ListNode curr = head;
        // ListNode prev = null;

        // while(curr != null){
        //     ListNode nextNode = curr.next;
        //     curr.next = prev;
            
        //     prev = curr;
        //     curr = nextNode;            
        // }

        // return prev;

        // Iterative approach

        // ListNode curr = head;
        // ListNode prev = null;

        // while(curr != null){
        //     ListNode currNextNode = curr.next;

        //     curr.next = prev;
        //     prev = curr;
        //     curr = currNextNode;
        // }

        // return prev;

        // Recursive approach

        return revers(head, null, null);
    }

    public ListNode revers(ListNode curr, ListNode prev, ListNode currNext){
        if(curr == null){
            return prev;
        }else{
            currNext = curr.next;
            curr.next = prev;
            return revers(currNext, curr, null);
        }
    }
}
