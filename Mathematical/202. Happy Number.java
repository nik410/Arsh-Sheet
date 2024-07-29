class Solution {
    public int digitSumSq(int n){
        int ans = 0;

        while(n != 0){
            int rem = n % 10;
            ans += (int)Math.pow(rem, 2);
            n /= 10;
        }

        return ans;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = digitSumSq(n);
        fast = digitSumSq(fast);
        while(slow != fast){
            slow = digitSumSq(slow);
            fast = digitSumSq(fast);
            fast = digitSumSq(fast);
            if(slow == fast && slow == 1)return true;
            if(slow == fast)return false;
        }

        return true;
    }
}
