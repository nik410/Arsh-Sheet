class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // List<Integer> al = new ArrayList();

        // for(int i = 0; i < nums.length; i++){
            
        //     if(nums[Math.abs(nums[i]) - 1] < 0){
        //         al.add(Math.abs(nums[i]));
        //         continue;
        //     }

        //     nums[Math.abs(nums[i]) - 1] *= -1;
        // }

        // // for(int i = 0; i < nums.length; i++){
            
        // // }

        // return al;


        ArrayList<Integer> al = new ArrayList();

        for(int i = 0; i < nums.length; i ++){

            if(nums[Math.abs(nums[i]) - 1] < 0){
                al.add(Math.abs(nums[i]));
            }

            nums[Math.abs(nums[i]) - 1] = -1 * nums[Math.abs(nums[i]) - 1];
        }

        return al;
    }
}
