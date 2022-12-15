class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
    int [][] dp=new int[text1.length()][text2.length()];
        for(int [] a:dp){
            Arrays.fill(a,-1);
        }
     return rec(text1, text2,0,0, text1.length(),text2.length(),dp);   
    }
    public static int rec(String t1, String t2, int i1, int i2,int l1,int l2,int [][] dp){
        if(i1>=l1||i2>=l2){
            return 0;
        }
        if(dp[i1][i2]!=-1){
        return dp[i1][i2];    
        }
        
        if(t1.charAt(i1)==t2.charAt(i2)){
            dp[i1][i2]=1+rec(t1,t2,i1+1,i2+1,l1,l2,dp);
            
        }
        else{
        dp[i1][i2]=Math.max(rec(t1,t2,i1,i2+1,l1,l2,dp),rec(t1,t2,i1+1,i2,l1,l2,dp));
        }
        return dp[i1][i2];
    }
}