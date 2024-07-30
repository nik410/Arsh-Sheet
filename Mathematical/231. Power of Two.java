class Solution {
    public boolean isPowerOfTwo(int n) {
    //    if( n <= 0)return false;

    //    return (n & (n - 1)) == 0;

    // if(n < 0)return false;

    // if(n == 0)return false;

    // while(n != 1){
    //     if(n % 2 == 1)break;
    //     n /= 2;
    // }

    // if(n == 1)return true;
    // else return false;
           
    // }

    // Using bit manipulation

    if(n <= 0)return false;

    if((n & (n - 1)) == 0)return true;
    else return false;
    }
}
