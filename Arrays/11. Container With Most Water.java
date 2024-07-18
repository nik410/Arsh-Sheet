class Solution {
    public int maxArea(int[] height) {
        // int l = 0, r = height.length - 1;
        // int ans = 0;
        // while(l < r){
        //     if(height[l] <= height[r]){
        //         ans = Math.max((r - l ) * height[l], ans);
        //         l++;
        //     }
        //     else if(height[l] > height[r]){
        //         ans = Math.max((r - l) * height[r], ans);
        //         r--;
        //     }
        //     else r--;
        // }

        // return ans;

        int l = 0, r = height.length - 1;

        int ans = 0;

        while(l < r){
            if(height[l] > height[r]){
                ans = Math.max(ans, Math.min(height[l], height[r]) *( r - l));
                r --;
            }
            else{
                ans = Math.max(ans, Math.min(height[l], height[r]) *( r - l));
                l ++;
            }
        }

        return ans;
    }
}
