class Solution {
    public int maxProfit(int[] prices) {
        // int buy = prices[0], maxProfit = 0;

        // // for(int i = 1; i < prices.length; i++){
        // //     if(prices[i] < buy){
        // //         buy = prices[i];
        // //     }
        // //     else{
        // //         if(prices[i] >= buy){
        // //         while(i < prices.length &&  prices[i] >= prices[i - 1]){
        // //             i++;
        // //         }
        // //         }

        // //         maxProfit += prices[i - 1] - buy;
        // //         i = i - 1;
        // //         buy = 10000;
        // //     }
        // // }

        // for(int i = 1; i < prices.length; i++){
        //     if(prices[i] > buy){
        //         maxProfit += prices[i] - buy;
        //         buy = prices[i];
        //     }
        //     else{
        //         buy = prices[i];
        //     }
        // }

        // return maxProfit;


        int buyP = 0, tP = 0;

        for(int  i = 0; i < prices.length; i ++){
            if(i == 0){
                buyP = prices[0];
                continue;
            }

            if(buyP > prices[i]){
                buyP = prices[i];
            }
            else if(buyP <= prices[i]){
                tP += prices[i] - buyP;
                buyP = prices[i];
            }
        }

        return tP;
    }
}
