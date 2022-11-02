class Solution {
    public int[] findBall(int[][] grid) {
         int m =grid.length;
         int n =grid[0].length;
         int[] ans=new int[n];
         for(int i =0;i<n;i++){
             dfs(0,i,n,m,i,ans,grid);
         }
        return ans;
    }
    public static void dfs(int row,int col,int n , int m,int i ,int [] ans,int[][] grid){
        if(row==m){
            ans[i]=col;
            return;
        }
        if(grid[row][col]==1){
            if(col==n-1||grid[row][col+1]==-1){
                ans[i]=-1;
                
            }
            else{
                dfs(row+1,col+1,n,m,i,ans,grid);
            }
        }
        else{
            if(col==0||grid[row][col-1]==1){
                ans[i]=-1;
                
            }
            else{
                dfs(row+1,col-1,n,m,i,ans,grid);
            }
        }
        return;
    }
}