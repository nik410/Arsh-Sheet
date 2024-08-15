class Solution {
    
    public static void inOrder(Node root, 
                        int key, Node[] pre, Node[] suc){
        
        
        if(root == null)return;
        
        inOrder(root.left, key, pre, suc);
        
        if(root.data < key){
            pre[0] = root;
        }
        
        if(root.data > key){
            if(suc[0] == null)
            suc[0] = root;
        }
       
        inOrder(root.right, key, pre, suc);
        
        
    }
    
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
       suc[0] = null;
        inOrder(root, key, pre, suc);
        
        
        //Lower Bound and Upper Bound is also possible but slower than above
        
        
        
        
        
        // update pre[0] with the predecessor of the key
        // update suc[0] with the successor of the key
    }
}
