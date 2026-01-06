class Solution {
    public int maxProfit(int[] prices) {
        int maxDiff = 0;
        // int buy = 0;
        // int sell = 0;
        for (int i=0;i<prices.length-1;i++){
            // for (int j =i+1 ;j<prices.length;j++){
                if(prices[i+1]-prices[i]> 0){
                    maxDiff += prices[i+1]-prices[i];
                }
            // }
        }
        return maxDiff;
    }
}