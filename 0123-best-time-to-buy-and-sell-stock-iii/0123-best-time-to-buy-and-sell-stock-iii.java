class Solution {
    public int maxProfit(int[] prices) {
        int [][] dp = new int[4][prices.length];
        for(int[]arr:dp){
            Arrays.fill(arr,-1);
        }
        return rec(prices,0,0,dp);    
    }
    public static int rec(int[] prices, int times, int idx,int [][] dp){
        if(idx==prices.length){
            return 0;
        }
        int ans =0;
        
        if(times==4){
            return 0;
        }
        if(dp[times][idx]!=-1){
            return dp[times][idx];
        }
        if(times%2==0){
        //nahi khareda
            ans=Math.max(rec(prices,times+1,idx+1,dp)-prices[idx],rec(prices,times,idx+1,dp));
            
        }
        else{
            //khareeda
            ans=Math.max(rec(prices,times+1,idx+1,dp)+prices[idx],rec(prices,times,idx+1,dp));
        }
        dp[times][idx]=ans;
        return ans;
    }
}