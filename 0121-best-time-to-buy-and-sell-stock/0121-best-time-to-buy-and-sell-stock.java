class Solution {
    public int maxProfit(int[] prices) {
     int ans =0;
     int max =prices[0];
     int min=prices[0];
        for(int i=1;i<prices.length;i++){
           if(prices[i]<min){
               min=prices[i];
               
           } 
            else if(prices[i]>min){
               max=prices[i];
               ans=Math.max(Math.abs(max-min),ans);
           }
            
        }
        return ans;
    }
}