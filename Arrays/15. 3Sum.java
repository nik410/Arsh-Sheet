class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>> ans = new ArrayList();
        
        // Arrays.sort(nums);

        // for(int i = 0; i < nums.length; i++){
        //     if(i > 0 && nums[i - 1] == nums[i])continue;
        //     int l = i + 1;
        //     int r = nums.length - 1;

        //     while(l < r){
        //         int a = nums[l];
        //         int b = nums[r];

        //         if(a + b + nums[i] == 0){
        //             ArrayList<Integer> al = new ArrayList();
        //             al.add(nums[i]);
        //             al.add(a);
        //             al.add(b);
        //             ans.add(new ArrayList(al));
        //             l++;
        //             r--;
        //            while(r > l && nums[r] == nums[r + 1])r--;
                    
        //             while(l < r && nums[l] == nums[l - 1])l++; 
                    
                    
        //         }
        //         else if(a + b + nums[i] < 0){
        //             l++;                   
        //         }
        //         else{
        //             r--;
        //         }
        //     }

        // }
        
        // return ans;


        // One way to approach is to make 3 loops selecting each of the triplet one by one on
        // all of the array ensuring no duplicates by value or index are there
        // TC: O(n^3) SC: O(1)


        //Use hashing to reduce the TC: O(n^2) SC:O(n)

        // Pointers approach

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList();
        int n = nums.length;
        for(int i = 0; i < n; i ++){
            if(i > 0 && nums[i] == nums[i - 1])continue;

            int l = i + 1;
            int r = n - 1;

            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];

                if(sum == 0){
                    List<Integer> al = new ArrayList();
                    al.add(nums[i]);
                    al.add(nums[l]);
                    al.add(nums[r]);

                    ans.add(al);

                    l ++;
                    while(l < r && nums[l] == nums[l - 1])l ++;
                    r --;
                    while(l < r && nums[r] == nums[r + 1]) r --;

                }
                else if(sum > 0){
                    r --;
                }
                else{
                    l ++;
                }
            }
        }


        return ans;
                

    }
}
