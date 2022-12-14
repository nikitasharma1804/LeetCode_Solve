class Solution {
    public int maxProfit(int[] prices, int fee) {
     int [] next = new int [2];
  
    int n =prices.length;
        for(int i =n-1;i>=0;i--){
            int [] curr= new int [2];
            for(int j =0;j<2;j++){
                int ans=0;
                if(j==0){//nahi khareeda hua
                 ans=Math.max(next[1]-prices[i],next[0]);   
                }
                else{
                    ans=Math.max(next[0]+prices[i]-fee,next[1]);
                }
                curr[j]=ans;
            }
         
            next=curr;
        }
        return next[0];
        
    }
}