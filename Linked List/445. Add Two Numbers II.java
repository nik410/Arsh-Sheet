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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Using an external stacks to store the l1 and l2 elements and then pop and add
        // Stack<Integer> st1 = new Stack();
        // Stack<Integer> st2 = new Stack();

        // ListNode temp = l1;
        // while(temp != null){
        //     st1.push(temp.val);
        //     temp = temp.next;
        // }
        // temp = l2;
        // while(temp != null){
        //     st2.push(temp.val);
        //     temp = temp.next;
        // }
        // int carry = 0;

        // ListNode dummy = new ListNode(-69);

        // ListNode ans = dummy;


        // while(st1.size() > 0 || st2.size() > 0){
        //     int ele1 = 0;
        //     int ele2 = 0;

        //     if(st1.size() > 0){
        //         ele1 = st1.pop();
        //     }

        //     if(st2.size() > 0){
        //         ele2 = st2.pop();
        //     }

        //     int sum = ele1 + ele2 + carry;
        //     carry = (int)sum / 10;

        //     ListNode l = new ListNode(sum % 10);
        //     dummy.next = l;
        //     dummy = dummy.next;
        // }

        // if(carry == 1){
        //     ListNode l = new ListNode(1);
        //     dummy.next = l;
        //     dummy = dummy.next;
        // }

        // ListNode ansN = ans.next;

        // // We have to reverse the ansN to get the final answer

        // ListNode curr = ansN;
        // ListNode prev = null;

        // while(curr != null){
        //     ListNode currNext = curr.next;
        //     curr.next =  prev;
        //     prev = curr;
        //     curr = currNext;
        // }

        // return prev;

        // By reversing both the list and applying the sum with carry logic for each listnode

        ListNode curr = l1;
        ListNode prev = null;

        while(curr != null){
            ListNode nextNodeCurr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNodeCurr;
        }

        ListNode newStartL1 = prev;

        curr = l2;
        prev = null;

        while(curr != null){
            ListNode nextNodeCurr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNodeCurr;
        }

        ListNode newStartL2 = prev;

        ListNode dummy = new ListNode(-69);

        ListNode ans = dummy;

        int carry = 0;

        while(newStartL1 != null || newStartL2 != null){
            int ele1 = 0;
            int ele2 = 0;

            if(newStartL1 != null){
                ele1 = newStartL1.val;
                newStartL1 = newStartL1.next;
            }

            if(newStartL2 != null){
                ele2 = newStartL2.val;
                newStartL2 = newStartL2.next;
            }

            int sum = ele1 + ele2 + carry;
            carry = (int)sum / 10;

            ListNode l = new ListNode(sum % 10);
            dummy.next = l;
            dummy = dummy.next;
        }

        if(carry == 1){
            ListNode l = new ListNode(1);
            dummy.next = l;
            dummy = dummy.next;
        }

        ListNode ansHead = ans.next;

        curr = ansHead;
        prev = null;

        while(curr != null){
            ListNode nextCurr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextCurr;
        }

        return prev;


    }
}
