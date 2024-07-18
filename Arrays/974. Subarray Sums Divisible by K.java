class Solution {
    public int subarraysDivByK(int[] nums, int k) {
    //     HashMap<Integer, Integer> hm = new HashMap();

    //    int sum = 0, ans  = 0;

    //    hm.put(0, 1);

    //     for(int  i = 0; i < nums.length; i ++){
    //         sum = (sum + nums[i] % k + k) % k;           

    //         int rem = (sum) % k;
    //         if(hm.containsKey(rem)){
    //             ans += hm.get(rem);
    //         }
           
    //         hm.put(rem, hm.getOrDefault(rem, 0) + 1);        

    //     }

    //     return ans;


    //Look at the constraints and consider edge cases like dealing eith negative sum

    HashMap<Integer, Integer> hm = new HashMap();

    hm.put(0, 1);

    int sum  = 0, c = 0; 

    for(int  i = 0; i < nums.length; i ++){
        sum += nums[i];
        sum %= k;
        sum += k;
        sum %= k;

        if(hm.containsKey(sum)){
            c += hm.get(sum);
        }

        hm.put(sum, hm.getOrDefault(sum, 0) + 1);

    }

    return c;
        
   }
}
