class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);

       int n = nums.length;
       int candidateAnswer1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
       int candidateAnswer2 = nums[0] * nums[1] * nums[2];
       int candidateAnswer3 = nums[0] * nums[1] * nums[n - 1];

       return Math.max(candidateAnswer1, Math.max(candidateAnswer2, candidateAnswer3));
       
    }
}
