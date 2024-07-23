class Solution {
    public boolean canJump(int[] nums) {
        // int maxRange = nums[0];

        // for(int i = 1; i < nums.length; i++){
        //     if(maxRange >= i){
        //         maxRange = Math.max(maxRange, i + nums[i]);
        //     }
        //     else{
        //         return false;
        //     }

        // }
        // return true;

        // Use of recursion
        // return reachRec(nums, 0);

        // Use of recursion with memoization
        // boolean dp[] = new boolean[nums.length];

        // return reachRecMemo(nums, 0, dp);

        int far = 0;

        for(int i = 0; i < nums.length; i ++){
           

            if(far < i )return false;
            far = Math.max(far, i + nums[i]);
        }

        return true;

    }

    public boolean reachRec(int nums[], int index){
        if(index == nums.length - 1)return true;
        if(nums[index] == 0)return false;


        int reach = index + nums[index];

        for(int i = index + 1; i <= reach; i ++){
            if(i > nums.length - 1)return true;
            return reachRec(nums, i);
        }
    
        return false;
    }

    public static boolean reachRecMemo(int nums[], int index, boolean dp[]){
        if(index == nums.length -1)return true;
        if(nums[index] == 0)return false;

        if(dp[index] == true)return true;

        int reach = index + nums[index];

        for(int i = index + 1; i <= reach; i ++){
            if(i >= nums.length - 1)return true;

            if(reachRecMemo(nums, i, dp))return dp[index] = true;

        }


        return dp[index] = false;
    }
}
