class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length;

        int leftSum = 0, rightSum = 0;
        int maxPoints = 0;

        for(int i = 0; i < k; i ++){
            leftSum += cardPoints[i];
        }

        maxPoints = leftSum;

        int rIndex  = len - 1;

        for(int i = k - 1; i >= 0; i --){
            leftSum -= cardPoints[i];
            rightSum += cardPoints[rIndex];
            rIndex --;

            maxPoints = Math.max(maxPoints, leftSum + rightSum);
        }

        return maxPoints;
        
    }
}
