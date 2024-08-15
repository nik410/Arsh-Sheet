// User function Template for Java

/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node divide(Node head) {
        Node dummy = new Node(-1);
        Node even = dummy;
        
        Node dummy2 = new Node(-1);
        Node odd = dummy2;
        
        
        Node temp = head;
        
        while(temp != null){
            if(temp.data % 2 == 0){
                even.next = temp;
                
                Node nextToTemp = temp.next;
                temp.next = null;
                temp = nextToTemp;
                
                even = even.next;
            }
            
            else if(temp.data % 2 == 1){
                odd.next = temp;
                
                Node nextToTemp = temp.next;
                temp.next = null;
                temp = nextToTemp;
                
                odd = odd.next;
                
            }
        }
        
        even.next = dummy2.next;
        
        return dummy.next;
    }
}
