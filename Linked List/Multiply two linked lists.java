
class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        long num1 = 0;
        
        long mod = (long)(1e9 + 7);
        Node temp = first;
        
        while(temp != null){
            num1 = (num1 * 10 + temp.data) % mod;
            temp = temp.next;
        }
        
        long num2 = 0;
        temp = second;
        
        while(temp != null){
            num2 = (num2 * 10 + temp.data) % mod;
            temp = temp.next;
        }
        
        return (num1 * num2)% mod;
        
    }
}
