class Solution {
    public String intToRoman(int num) {
      
        int nums[] = {1, 4, 5, 9, 10, 40, 50, 90,100, 400, 500, 900, 1000};
        String roman[] = {"I", "IV", "V", "IX", "X", "XL","L", "XC", "C", "CD", "D", "CM", "M"};

        String ans = "";
        int index = nums.length - 1;
        while(num > 0){            

            while(num - nums[index] >= 0){
                ans += roman[index];
                num -= nums[index];
            }     
            index--;       
        }

        return ans;

    }
}
