class Solution {
    public int maxProfit(int[] prices) {
    int [] next = new int [2];
    int [] nnext= new int [2];
    int n =prices.length;
        for(int i =n-1;i>=0;i--){
            int [] curr= new int [2];
            for(int j =0;j<2;j++){
                int ans=0;
                if(j==0){//nahi khareeda hua
                 ans=Math.max(next[1]-prices[i],next[0]);   
                }
                else{
                    ans=Math.max(nnext[0]+prices[i],next[1]);
                }
                curr[j]=ans;
            }
            nnext=next;
            next=curr;
        }
        return next[0];
    }
}