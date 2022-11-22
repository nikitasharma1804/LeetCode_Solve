class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m =mat.length;
        int n = mat[0].length;
        int [][] Ans = new int[m][n];
        
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                
                int ans=0;
                for(int r=i-k;r<=i+k;r++){
                    
                    if(r>=0&&r<m){
                       for(int c=j-k;c<=j+k;c++){ 
                           if(c>=0&&c<n){
                               ans+=mat[r][c];
                           }
                    }
                }
            }
                Ans[i][j]=ans;
        }
    }
        return Ans;
}
}