class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        int cost=0;
        
        for(int i=0;i<prices.length;i++){
            cost=prices[i]-min;
            max=Math.max(max,cost);
        
        System.out.println(max);
        min=Math.min(min,prices[i]);
        }
    return max;

    }
    

}