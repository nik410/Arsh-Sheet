class Solution {
    public int subarraySum(int[] nums, int k) {
        // HashMap<Integer, Integer> hm = new HashMap();
        // int sum = 0, ans = 0;
        // for(int i : nums){
        //     sum += i;
        //     if(sum == k)ans++;

        //     int req = sum - k;
            
        //     if(hm.containsKey(req))ans += hm.get(req);
        //     hm.put(sum, hm.getOrDefault(sum, 0) + 1);

        // }

        // return ans;

        // Brute force approach to this task is to generate all subarrays and  
        // count the answers which can be computationally heavy
        // TC: O(n^3) [Extreme Naive] or O(n^2) SC: O(1)

        // int ans = 0;

        // for(int i = 0; i < nums.length; i ++){
        //     int sum = 0;
        //     for(int j = i; j < nums.length; j ++){
        //         sum += nums[j];
        //         if(sum == k)ans ++;
        //     }
        // }

        // return ans;

        // Better appraoch is to use hashMap to store prev sum using a bit of math 
        // Can give solution to the task

        HashMap<Integer, Integer> hm = new HashMap();
        int sum  = 0, ans = 0;

        for(int  i = 0; i < nums.length; i ++){
            sum += nums[i];
            if(sum == k){
                ans ++;
            }

            int rem = sum - k;

            if(hm.containsKey(rem)){ans += hm.get(rem);}

            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }

        return ans;
    }
}
