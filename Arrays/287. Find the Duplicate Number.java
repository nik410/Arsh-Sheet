class Solution {
    public int findDuplicate(int[] nums) {
      
    //   int ans = 0;

    //   for(int i = 0; i < nums.length; i++){
    //     if( nums[Math.abs(nums[i])] < 0){
    //         ans = Math.abs(nums[i]); break;
    //        }
 
    //     nums[Math.abs(nums[i])] *= -1 ;
    //   }

    // int ans = 0;

    // for(int i = 0; i < nums.length; i ++){
    //     if(nums[Math.abs(nums[i])] < 0){
    //         return Math.abs(nums[i]);
    //     }

    //     nums[Math.abs(nums[i])] = (nums[Math.abs(nums[i])]) * -1;
    // }


    // return ans;

    //Tortoise and hare method
    
    int slow = nums[0];
    int fast = nums[0];

    while(true){
        slow = nums[slow];
        fast = nums[nums[fast]];

        if(slow == fast){
            break;
        }
    }

    slow = nums[0];

    while(slow != fast){
        slow = nums[slow];
        fast = nums[fast];
    }

    return slow;
    

    
  }
}
