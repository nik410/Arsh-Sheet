class Solution {
    public int reverse(int x) {
        // long absX = Math.abs(x);
        // int sign = 1;
        // if(x < 0)sign *= -1;
        // long ans = 0;

        // while(absX > 0){
        //     long rem = absX % 10;
        //     ans = ans * 10 + rem;
        //     absX /= 10; 
        // }

        // if(ans > Integer.MAX_VALUE && sign == 1){
        //     return 0;
        // }
        // if(ans > Integer.MAX_VALUE && sign == -1){
        //     return 0;
        // }

        // return (int)ans * sign;

        // Using integer only

        int ans = 0;

        while(x != 0){
            int rem = x % 10;
            x /= 10;

            // ans * 10 + rem > MAX_VALUE or ans * 10 + rem < MIN_VALUE it will cause overflow
            if((ans > (Integer.MAX_VALUE / 10)) || (ans < (Integer.MIN_VALUE / 10))){
                return 0;
            }
            ans = ans * 10 + rem;
        }

        return ans;


    }
}
