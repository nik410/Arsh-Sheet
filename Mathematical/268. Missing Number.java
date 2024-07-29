class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int sumTotal = ((n)*(n + 1)) / 2;
        // int sumArray = Arrays.stream(nums).sum();

        // return sumTotal - sumArray;

        // Using Bit Manipulations

        int ans = nums.length;

        for(int i = 0; i < nums.length; i ++){
            ans = (ans ^ i ^ nums[i]);
        }

        return ans;
    }
}
