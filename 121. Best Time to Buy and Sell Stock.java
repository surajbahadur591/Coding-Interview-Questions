class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <2){
            return 0;
        }
        int minSoFar = Integer.MAX_VALUE;
        int maxDiff = 0;
        for ( int i= 0;i<prices.length;i++){
            if(minSoFar > prices[i])
                minSoFar = prices[i]; //minSoFar = Math.min(minSoFar, prices[i]);
            maxDiff = Math.max(maxDiff, prices[i] - minSoFar);
        }
        return maxDiff;
    }
}