class Solution {
    public boolean compare(int arr[], int brr[]){
        if((arr[0] == brr[0]) && (arr[1] == brr[1]))return true;
        else return false;
    }
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {

        if(compare(p1, p2)) return false;
        if(compare(p1, p3)) return false;
        if(compare(p1, p4)) return false;
        if(compare(p2, p3)) return false;
        if(compare(p2, p4)) return false;
        if(compare(p3, p4)) return false;
        
        HashMap<Double, Integer> hm = new HashMap();

        double dist1 = Math.sqrt(Math.pow((p2[0] - p1[0]), 2) + Math.pow((p2[1] - p1[1]), 2));
        double dist2 = Math.sqrt(Math.pow((p3[0] - p1[0]), 2) + Math.pow((p3[1] - p1[1]), 2));
        double dist3 = Math.sqrt(Math.pow((p4[0] - p1[0]), 2) + Math.pow((p4[1] - p1[1]), 2));
        double dist4 = Math.sqrt(Math.pow((p2[0] - p3[0]), 2) + Math.pow((p2[1] - p3[1]), 2));
        double dist5 = Math.sqrt(Math.pow((p2[0] - p4[0]), 2) + Math.pow((p2[1] - p4[1]), 2));
        double dist6 = Math.sqrt(Math.pow((p3[0] - p4[0]), 2) + Math.pow((p3[1] - p4[1]), 2));
        hm.put(dist1, hm.getOrDefault(dist1, 0) + 1); 
        hm.put(dist2, hm.getOrDefault(dist2, 0) + 1);
        hm.put(dist3, hm.getOrDefault(dist3, 0) + 1);        
        hm.put(dist4, hm.getOrDefault(dist4, 0) + 1);    
        hm.put(dist5, hm.getOrDefault(dist5, 0) + 1);        
        hm.put(dist6, hm.getOrDefault(dist6, 0) + 1); 
        if(hm.size() >= 3)return false;
        else{
            if(hm.size() == 1)return false;
            for(double d: hm.keySet()){                
                if(hm.get(d) % 2 == 1)return false;
            }           
            return true;
            
        }
    }
}
