class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n =s.length();
        int [][] dp = new int[n][n];
     HashSet<String> hs= new HashSet<>();
        for(String s1:wordDict){
            hs.add(s1);
        }
        
        for(int[]arr:dp){
            Arrays.fill(arr,-1);
        }
        
        if( rec(s,hs,0,0,dp)==1){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static int rec(String s,HashSet<String> hs,int si,int ei,int [][] dp){
        if(si==ei&&si==s.length()){
            return 1;
        }
        if(ei>=s.length()){
            return 0;
        }
        if(dp[si][ei]!=-1){
            return dp[si][ei];
        }
        String ss=s.substring(si,ei+1);
        int val=0;
        if(hs.contains(ss)){
        val=rec(s,hs,ei+1,ei+1,dp);    
        }
        int val2=rec(s,hs,si,ei+1,dp);
        if(val==1||val2==1){
            dp[si][ei]=1;
        }
        else{
            dp[si][ei]=0;
        }
        return dp[si][ei];
    }
}