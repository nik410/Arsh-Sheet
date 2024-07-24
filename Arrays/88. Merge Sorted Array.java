class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    //     int pointer1 = m - 1;
    //     int pointer2 = n - 1;
    //     int pMerge = n + m - 1;
        

    //     while(pointer2 >= 0){
            

    //         if(pointer1 >= 0 && nums1[pointer1] > nums2[pointer2]){
    //             nums1[pMerge] = nums1[pointer1] ;
    //             pointer1 --;
    //             pMerge --;
    //         }
    //         else{
    //             nums1[pMerge] = nums2[pointer2] ;
    //             pointer2 --;
    //             pMerge --;
    //         }
    //    }


    // The issue with below code is loss of data in nums1 due to concurrent changes in nums1

    // int p1 = 0, p2 = 0;
    // int index = 0;
    // while(p1 < m && p2 < n){
    //     if(nums1[p1] <= nums2[p2]){
    //         nums1[index] = nums1[p1];
    //         index ++;
    //         p1 ++;
    //     }
    //     else{
    //         nums1[index] = nums2[p2];
    //         index ++;
    //         p2 ++;
    //     }
    // }

    //  while(p2 < n){
    //     nums1[index] = nums2[p2];
    //     index ++;
    //     p2 ++;
    // }

    // while(p1 < m){
    //     nums1[index] = nums1[p1];
    //     index ++;
    //     p1 ++;
    // }

    // To solve the above problem we can start filling from the back


    int p1= m - 1;
    int p2 = n - 1;

    int index = m + n - 1;

    while(p1 >= 0 && p2 >= 0){
        if(nums1[p1] > nums2[p2]){
            nums1[index] = nums1[p1];
            p1 --;
            index --;
        }
        else{
            nums1[index] = nums2[p2];
            p2 --;
            index --;
        }
    }

    while(p1 >= 0){
        nums1[index] = nums1[p1];
        p1 --;
        index --;
    }

    while(p2 >= 0){
        nums1[index] = nums2[p2];
        p2 --;
        index --;
    }
    


        
    }
}
