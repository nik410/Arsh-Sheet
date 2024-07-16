class Solution {
    public int[] twoSum(int[] nums, int target) {
        // //Use Brute force and use two loops
        // int ans[] = new int[2];
        // for(int i = 0; i < nums.length; i ++){
        //     ans[0] = i;
        //     for(int j = i + 1; j < nums.length; j ++){
        //         if(nums[i] + nums[j] == target){
        //             ans[1] = j;
        //             return ans;
        //         }
        //     }
        // }

        // return ans;

        // // A better solution to the task is use hashmap

        // HashMap<Integer, Integer> hm = new HashMap();

        // for(int i = 0; i < nums.length; i ++){
        //     if(hm.containsKey(target - nums[i])){
        //         return new int[]{i, hm.get(target - nums[i])};
        //     }
        //     hm.put(nums[i], i);
        // }

        // return new int[]{};

        // One of possible solution is to use two pointer on the sorted array
        // Drawback is increased time complexity, while reducing the SC to O(1) to the hashmap solution

        // Arrays.sort(nums);
        // int low = 0, high = nums.length - 1;
        // while(low < high){
        //     if(nums[low] + nums[high] == target){
        //         return new int[]{low, high};
        //     }
        //     else if(nums[low] + nums[high] > target){
        //         high --;
        //     }
        //     else if(nums[low] + nums[high] < target){
        //         low ++;
        //     }
        // }
        // return new int[]{};

        //The sorting can impact the original index and its associated value
        //Usage of the hashMap solution is optimal considering that case

        // Arrays.sort(nums);

        // int l = 0, r = nums.length - 1;

        // while(l < r){
        //     int sum = nums[l] + nums[r];

        //     if(sum == target){
        //         return new int[]{l, r};
        //     }
        //     if(sum < target){
        //         l++;
        //     }
        //     else if(sum > target){
        //         r --;
        //     }
        // }

        // return new int[]{};


        HashMap<Integer, Integer> hm = new HashMap();

        for(int i = 0; i < nums.length; i ++){
            if(hm.containsKey(target - nums[i])){
                return new int[]{i, hm.get(target - nums[i])};
            }

            hm.put(nums[i], i);
        }

        return new int[]{};



    }
}
