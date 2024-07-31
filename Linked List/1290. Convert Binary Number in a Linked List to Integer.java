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
    public int getDecimalValue(ListNode head) {
        // Using a stack
        // Utilizes extra space and  time complexity TC: O(2*N) SC:O(N)
        // Stack<Integer> st = new Stack();
        // ListNode temp = head;
        // while(temp != null){
        //     st.push(temp.val);
        //     temp = temp.next;
        // }

        // // System.out.println(st);

        // int i = 0;
        // int ans = 0;
        // while(!st.isEmpty()){
        //     ans += st.pop() * Math.pow(2, i);
        //     i++;
        // }

        // return ans;

        // Reducing the space complexity to O(1)

        // ListNode temp = head;
        // int countNodes = 0;

        // while(temp != null){
        //     countNodes ++;
        //     temp = temp.next;
        // }

        // int ans = 0;

        // temp = head;

        // while(temp != null){
        //     ans += temp.val * Math.pow(2, countNodes - 1);
        //     countNodes --;
        //     temp = temp.next;
        // }

        // return ans;


        // Reducing the extra loop

        int ans = 0;
        ListNode temp = head;

        while(temp != null){
            ans = ans * 2 + temp.val;
            temp = temp.next;
        }

        return ans;
        

    }
}
