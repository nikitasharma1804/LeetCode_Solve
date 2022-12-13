class Solution {
    public int minFallingPathSum(int[][] matrix) {
   
    int n =matrix.length;
    int ans=Integer.MAX_VALUE;
        int[][] dp= new int[n][n];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        for(int i =0;i<n;i++){
            ans=Math.min(ans, rec(0,i,matrix,n,dp));
        }
            
         return ans;   
        }
     public static int rec(int i , int j , int[][] matrix , int n,int[][] dp){
         if(i<0||i>=n||j<0||j>=n){
             return Integer.MAX_VALUE;
         }
         if(i==n-1){
             return matrix[i][j];
         }
         if(dp[i][j]!=-1){
             return dp[i][j];
         }
         int s1=rec(i+1,j-1,matrix,n,dp);
         int s2=rec(i+1,j,matrix,n,dp);
         int s3=rec(i+1,j+1,matrix,n,dp);
         int ans= matrix[i][j]+Math.min(Math.min(s1,s2),s3);
         dp[i][j]=ans;
         return ans;
    }
}