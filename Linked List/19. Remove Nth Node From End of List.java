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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    //    ListNode p1 = head;
    //    ListNode p2 = null;

    //     int c = 1;
    //     while(p1.next != null){
    //         c++;
    //         if(c <= n){
    //             p1 = p1.next;
    //         }
    //         else{
    //             p1 = p1.next;
    //             if(p2 == null)p2 = head;
    //             else
    //             p2 = p2.next;
    //         }
    //     }
                  
    //     if(p2 == null)return head.next;

    //     if(p2.next == null) p2.next = null;
        
    //     else{

    //     p2.next = p2.next.next;

    //     }

    //     return head;


    // ListNode pnt1 = head;
    // ListNode pnt2 = null;
    // int c = 0;
    // while(pnt1 != null){
    //     c++;
    //     if(c <= n){
    //         pnt1 = pnt1.next;
    //     }
    //     else{
    //         pnt1 = pnt1.next;
    //         if(pnt2 == null)pnt2 = head;
    //         else{
    //             pnt2 = pnt2.next;
    //         }
    //     }
    // }

    // if(pnt2 == null)return head.next;

    // if(pnt2.next == null)pnt2.next = null;

    // else{
    //     pnt2.next = pnt2.next.next;
    // }

    // return head;

    // Approach One is to find find the length of ll and then fing len - n - 1 node and then change the link from
    // that node to nxt next
        // int len = 0;
        // ListNode temp = head;

        // while(temp != null){
        //     len ++;
        //     temp = temp.next;
        // }

        // int pntNode = len - n - 1;

        // if(pntNode == -1)return head.next;

        // ListNode pnt = head;

        // while( pntNode -- > 0){
        //     pnt = pnt.next;
        // }

        // pnt.next = pnt.next.next;

        // return head;

        // the above appraoch takes 2 passes 

        // To do it in one pass we can store nodeNumber and node in hashmap 
        // and then delete the given nth node from back
        // But this will result in O(len) extra space
        // This can be further optimised by only soting n node in the hashmap at a time bringing
        // SC to O(n) 


        // Approach two using two pointers
        // If a pointer 1 is n steps ahead of another pointer 
        // At the time pnt1 reaches the end the pnt2 will be at the nth from back node

        ListNode pnt1 = head;
        ListNode pnt2 = null;
        int c = 1;
        while(pnt1 != null){
            if(c <= n){
                pnt1 = pnt1.next;
            }
            else{
                pnt1 = pnt1.next;
                if(pnt2 == null)pnt2 = head;
                else{
                    pnt2 = pnt2.next;
                }
            }
            c ++;
        }

        if(pnt2 == null)return head.next;
        else{
            pnt2.next = pnt2.next.next;
            return head;
        }

    }
}
