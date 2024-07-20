class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // Bruteforce approach of this is to select all 4 elements accross
        // all the elements while ensuring no duplicates and same index is used
        // TC: O(n^4) SC:O(n)

        // Usage of hashing TC:O(n^3) SC:O(n)

        // Using sorting and two pinters 
        // TC: O(n^2) SC: O(1)

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList();

        int len = nums.length;
        for(int i = 0; i < len; i ++){
            if(i > 0 && nums[i] == nums[i - 1]){continue;}

            for(int j = i + 1; j < len; j ++){
                if(j > i + 1 && nums[j] == nums[j - 1]){continue;}

                int l = j + 1;
                int r = len - 1;

                while(l < r){

                    // Important when adding a chain of integers
                    // even though where you store your answer is long
                    // java consider the integers  and add it and this can cause overflow
                    // So always upcast one of the integers to long before hand
                    long sum = (long)nums[i] + nums[j] + nums[l] + nums[r];
                    
                    if(sum == target){
                       
                        List<Integer> al = new ArrayList();
                        al.add(nums[i]);
                        al.add(nums[j]);
                        al.add(nums[l]);
                        al.add(nums[r]);

                        ans.add(al);
                        
                        l ++;

                        while(l < r && nums[l] == nums[l - 1])l ++;

                        r --;

                        while(l < r && nums[r] == nums[r + 1])r --;
                    }
                    else if( sum > target){
                        r--;
                    }
                    else{
                        l ++;
                    }
                }
            }
        }


        return ans;
    }
}
