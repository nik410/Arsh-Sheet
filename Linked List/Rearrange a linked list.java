lass Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
This is method only submission.
You only need to complete the below method.
*/
class Solution {

    // Should rearrange given linked list such that all even
    // positioned Nodes are before odd positioned.
    // Returns nothing
    void rearrangeEvenOdd(Node head) {
       Node dummy1 = new Node(-1), dummy2 = new Node(-1);
       Node odd = dummy1, even = dummy2;
       
       Node temp = head;
       int ind = 1;
       while(temp != null){
           if(ind % 2 == 1){
               odd.next = temp;
               
               Node nextTemp = temp.next;
               temp.next = null;
               temp = nextTemp;
               
               odd = odd.next;
           }
           
           else{
              
               even.next = temp;
               
               Node nextTemp = temp.next;
               temp.next = null;
               temp = nextTemp;
               
               even = even.next;
           }
           
           ind ++;
       }
       
       odd.next = dummy2.next;
       
    }
}
