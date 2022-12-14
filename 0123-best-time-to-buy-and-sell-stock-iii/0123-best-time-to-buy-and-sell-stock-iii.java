class Solution {
    public int maxProfit(int[] prices) {
        int []dp = new int[5];
        
        int n =prices.length;
        for(int i =n-1;i>=0;i--)
        {
            int []curr = new int[5];
        for(int j=0;j<4;j++){
                int ans =0;
              if(j%2==0){
        //nahi khareda
            ans=Math.max(dp[j+1]-prices[i],dp[j]);
            
        }
        else{
            //khareeda
            ans=Math.max(dp[j+1]+prices[i],dp[j]);
        }   
                
                
                curr[j]=ans;
            }
            dp=curr;
        }
        
       return dp[0];   
    }

}