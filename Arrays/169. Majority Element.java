class Solution {
    public int majorityElement(int[] nums) {
    //    int count = 0;
    //    int candEle = nums[0];

    //     for(int i = 0; i < nums.length; i++){
    //         if(candEle == nums[i]){
    //             count++;
    //         }
    //         else{
    //             count --;
    //             if(count == 0){
    //                 candEle = nums[i];
    //                 count++;
    //                 }
    //         }
    //     }

    //     return candEle;

    //Boyer Moore Voting Algo

    // int candEle = 0;
    // int count = 0;

    // for(int i = 0; i < nums.length; i ++){
    //     if(count == 0){
    //         candEle = nums[i];
    //         count ++;
    //     }
    //     else {
    //         if(nums[i] == candEle){
    //             count ++;
    //         }
    //         else{
    //             count --;
    //         }        
    //     }
    // }

    // return candEle;


    // Brute force way to solve the task is to make a hashmap and store value frequency
    //TC: O(n) SC:(n)

    // Most optimal way to solve it is to implemeny boyer moore voting algorithm

    int candEle = 0;
    int count = 0;

    for(int i = 0; i < nums.length; i ++){
        if(count == 0){
            candEle = nums[i];
            count ++;
        }
        else if(nums[i] == candEle){
            count ++;
        }
        else if(nums[i] != candEle){
            count --;
        }

    }

    return candEle;


    }
}
