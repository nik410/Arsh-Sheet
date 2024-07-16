class Solution {
    public int removeDuplicates(int[] nums) {
        // int start = 0, end = 1, unique = 1;
        // while(end < nums.length){
        //     if(nums[start] == nums[end]){
        //         end++;
        //     }
        //     else if( nums[start] != nums[end]){
        //         start ++;
        //         nums[start] = nums[end];
        //         unique++;
        //         end++;
        //     }
        // }

        // return unique;

        int l = 1, r = 0, count = 1;

        for(int i = 1; i < nums.length; i ++){
            if(nums[i] == nums[l - 1]){
                continue;
            }
            else if(nums[i] != nums[l - 1]){
                nums[l] = nums[i];
                count ++;
                l++;
            }
        }


        return count;

    }
}
