/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> hm = new HashMap();

        if(head == null)return null;

        Node newHead = new Node(head.val);

        hm.put(head, newHead);

        Node curr = head.next;
        Node prev = newHead;

        Node headOfAns = newHead;

        while(curr != null){
            Node newNode = new Node(curr.val);
            hm.put(curr, newNode);

            prev.next = newNode;
            prev = newNode;

            curr = curr.next;
        }
        // System.out.println(hm +" :HM");
        Node temp = head;
        Node newLL = headOfAns;

        while(temp != null){
            if(temp.random == null){
                temp = temp.next;
                newLL = newLL.next;
                continue;
            } else{
                Node randomNode = temp.random;
                newLL.random = hm.get(randomNode);
                newLL = newLL.next;
            }

            temp = temp.next;
        }

        return headOfAns;

        
    }
}
