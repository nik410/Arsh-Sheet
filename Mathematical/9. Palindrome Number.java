class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)return false;
        long reverseOfX = 0;

        // Finding how many digits are there

        int placeN = 0;
        int tempX = x;
        while(tempX != 0){
            tempX /= 10;
            placeN ++;
        }

        // Reversing the number x 

        int place = placeN;
        
        int copyOfX = x;
        while(copyOfX > 0){
            int rem = copyOfX % 10;
            reverseOfX += Math.pow(10, place - 1) * rem;
            if(place == placeN  && rem  == 0)return false;
            place --;
            copyOfX /= 10;
        }

        // System.out.println(reverseOfX + "   " + x);

        if(reverseOfX > Integer.MAX_VALUE)return false;
        if(reverseOfX == x)return true;
        
        return false;
    }
}   
