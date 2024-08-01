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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        // ListNode pnt1 = list1;
        // ListNode pnt2 = list2;

        // if(list1 == null)return list2;
        // if(list2 == null)return list1;

        // ListNode copy1 = list1;
        // ListNode copy2 = list2;

        // while(pnt1 != null && pnt2 != null){
        //     if(pnt1.val <= pnt2.val){
        //         ListNode pnt2NextNode = pnt2.next;
        //         pnt2.next = pnt1;
        //         pnt2 = pnt2NextNode;
        //         pnt1 = pnt1.next;
        //     }
        //     else{
        //         ListNode pnt1NextNode = pnt1.next;
        //         pnt1.next = pnt2;
        //         pnt1 = pnt1NextNode;
        //         pnt2 = pnt2.next;
        //     }
        // }

        // if(list1.val <=  list2.val){
        //     return copy1;
        // }
        // else{
        //     return copy2;
        // }

        // Iterative

        // ListNode dummy = new ListNode(-11);
        // ListNode dummyCopy = dummy;

        // ListNode pnt1 = list1;
        // ListNode pnt2 = list2;

        // while(pnt1 != null && pnt2 != null){
        //     int val1 = pnt1.val;
        //     int val2 = pnt2.val;

        //     if(val1 <= val2){
        //         dummyCopy.next = pnt1;
        //         pnt1 = pnt1.next;
        //         dummyCopy = dummyCopy.next;
        //     }
        //     else{
        //         dummyCopy.next = pnt2;
        //         pnt2 = pnt2.next;
        //         dummyCopy = dummyCopy.next;
        //     }
        // }

        // if(pnt1 == null){
        //     dummyCopy.next = pnt2;
        // }
        // if(pnt2 == null){
        //     dummyCopy.next = pnt1;
        // }

        // return dummy.next;

        // Recursive

        if(list1 == null)return list2;
        if(list2 == null)return list1;
        
        if(list1.val <= list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;                 
        }
        else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
