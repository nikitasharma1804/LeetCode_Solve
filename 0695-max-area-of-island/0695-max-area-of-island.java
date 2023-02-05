class Solution {
    public int maxAreaOfIsland(int[][] grid) {
    int m =grid.length;
    int n =grid[0].length;
    int ans=0;
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j]==1){
                    ans =Math.max(ans,dfs(grid, i, j ));
                }
            }
        }
        return ans;
        
        
    }
    public static int dfs(int[][] grid , int i, int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        
        int ans=1;
        ans+=dfs(grid,i+1,j);
        ans+=dfs(grid,i,j+1);
        ans+=dfs(grid,i-1,j);
        ans+=dfs(grid,i,j-1);
        return ans;
        
    }
}