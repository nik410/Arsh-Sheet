/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // ListNode pnt1 = headA;
        // ListNode pnt2 = headB;

        // while(pnt1 != null && pnt2 != null){
        //     pnt1 = pnt1.next;
        //     pnt2 = pnt2.next;
        // }

        // if(pnt1 == null){
        //     ListNode pnt3 = headB;
        //     while(pnt2 != null){
        //         pnt2 = pnt2.next;
        //         pnt3 = pnt3.next;
        //     }

        //     ListNode pntACopy = headA;

        //     while(pnt3 != pntACopy){
        //         pnt3 = pnt3.next;
        //         pntACopy = pntACopy.next;
        //     }

        //     return pnt3;

        // }

        //  if(pnt2 == null){
        //     ListNode pnt3 = headA;
        //     while(pnt1 != null){
        //         pnt1 = pnt1.next;
        //         pnt3 = pnt3.next;
        //     }

        //     ListNode pntACopy = headB;

        //     while(pnt3 != pntACopy){
        //         pnt3 = pnt3.next;
        //         pntACopy = pntACopy.next;
        //     }

        //     return pnt3;

        // }

        //  return headA;

        // Bruteforce use a hashmap to store the nodes if it already exists it os the common node

        // HashSet<ListNode> hs = new HashSet();

        // ListNode pnt1 = headA;

        // while(pnt1 != null){
        //     hs.add(pnt1);
        //     pnt1 = pnt1.next;
        // }

        // ListNode pnt2 = headB;

        // while(pnt2 != null){
        //     if(hs.contains(pnt2))return pnt2;
        //     else hs.add(pnt2);

        //     pnt2 = pnt2.next;
        // }

        // return null;

        // TC: O(n + m) SC: O(n + m)

        // Without extra space

        ListNode pnt1 = headA;
        ListNode pnt2 = headB;

        while(pnt1 != null && pnt2 != null){
            pnt1 = pnt1.next;
            pnt2 = pnt2.next; 
        }

        // If pnt1 == null it means it is either smaller in size than List B or equal to Size
        if(pnt1 == null){
            ListNode startNodeB = headB;

            while(pnt2 != null){
                startNodeB = startNodeB.next;
                pnt2 = pnt2.next;
            }

            ListNode startNodeA = headA;

            while(startNodeA != null){
                if(startNodeA == startNodeB)return startNodeA;
                startNodeA = startNodeA.next;
                startNodeB = startNodeB.next;
            }

            return null;
        }

        if(pnt2 == null){
            ListNode startNodeA = headA;

            while(pnt1 != null){
                pnt1 = pnt1.next;
                startNodeA = startNodeA.next;
            }

            ListNode startNodeB = headB;

            while(startNodeB != null){
                if(startNodeA == startNodeB)return startNodeA;
                startNodeA = startNodeA.next;
                startNodeB = startNodeB.next;
            }

            
            return null;
        }

        //Just for formality all the cases are handled using above if statement
        return null;
        

    }
}
