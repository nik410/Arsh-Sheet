class Solution {
    public int reversePairs(int[] nums) {
        // Bruteforce of using two loops would result in Time Limit Exceeded as n value is large
        // In most cases a computer can perform 10^8 to 10^9 operations per sec

        // int ans = 0;

        // for(int i = 0; i < nums.length; i ++){
        //     for(int j = i + 1; j < nums.length; j ++){
        //         if((long)nums[i] > (long)2 * nums[j]){
        //             ans ++;
        //         }
        //     }
        // }

        // return ans;

        // One intuition is to make a copy of the array an then sort it
        // On that sorted array we can use binary search
        // After this we start our loop from the end of the original array
        // For each element in loop, we search for element in the sorted copy array for 
        // an integer greater than nums[j] * 2 this takes log(n) time after this we 
        // delete the entry of the nums[j] from the sorted array  

        // List<Long> al = new ArrayList();
        // for(int i: nums){
        //     al.add((long)i);
        // }

        // Collections.sort(al);

        // int ans = 0;

        // for(int i = nums.length - 1; i >= 0; i --){
        //     int uppBo = upperBound(al, 2 * nums[i]);
            
        //     int freq = Math.max(0, al.size() - uppBo); 

        //     System.out.println("Freq: " +  freq);
            
            
            
        //     al.remove((long) nums[i]);
           
        //     ans += freq;
        // }
        
        
        // return ans;

        // The above code id running in Code 360 website but only for positive contrainst

        // To gain the most optimal solution we have to use concept of merge sort

        return mergeSort(nums, 0, nums.length - 1);


    }

    public void merge(int nums[], int l, int r, int mid){
        int left[] = new int[mid - l + 1];
        int right[] = new int[r - mid];

        for(int i = 0; i < mid - l + 1; i ++){
            left[i] = nums[l + i];
        }

        for(int i = 0; i < r - mid; i ++){
            right[i] = nums[mid + 1 + i];
        }

        int p1 = 0, p2 = 0, k = l;

        while(p1 < mid - l + 1 && p2 < r - mid){
            if(left[p1] <= right[p2]){
                nums[k] = left[p1];
                p1 ++;
                k ++;
            }
            else{
                nums[k] = right[p2];
                p2 ++;
                k ++;
            }
        }

        while(p1 < mid - l + 1){
            nums[k] = left[p1];
            p1 ++;
            k ++;
        }

        while(p2 < r - mid){
            nums[k] = right[p2];
            p2 ++;
            k ++;
        }

    }

    public int revPairs(int nums[], int l, int r, int mid){
        int count = 0;
        int right = mid + 1;

        for(int i = l; i <= mid; i ++){
            while(right <= r && nums[i] > 2 * (long)(nums[right]))right ++;
            count += (right - mid - 1);
        }

        return count;
    }

    public int mergeSort(int nums[], int l, int r){
        int count = 0;
        if(l < r){
            int mid = l + (r - l) / 2;
            count += mergeSort(nums, l, mid);
            count += mergeSort(nums, mid + 1, r);
            count += revPairs(nums, l, r, mid);
            merge(nums, l, r, mid);
        }

        return count;
    }

    // public int upperBound(List<Long> al, long x){      

    //     int l = 0, r = al.size() - 1;
    //     int ans =  r + 1;

    //     while(l <= r){
    //         int mid = l +(r - l) / 2;
    //         if((long)al.get(mid) > x){
    //             ans = mid;
    //             r = mid - 1;
    //         }
    //         else{
    //             l = mid + 1;
    //         }
    //     }

    //     // System.out.println(ans +": ans" + "x: " + x);

    //     return ans;
    // }

}
