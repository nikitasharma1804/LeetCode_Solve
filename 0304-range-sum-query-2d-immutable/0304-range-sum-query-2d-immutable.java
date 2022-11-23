class NumMatrix {
    int [][] prefix;
    
    public static int getprefix(int r , int c , int [][] prefix){
        if(r<0||c<0){
            return 0;
        }
        return prefix[r][c];
    }
    
    public NumMatrix(int[][] matrix) {
        
    
    int m = matrix.length;
    int n = matrix[0].length;
     System.out.println(n); 
        System.out.println(m);
    prefix = new int [m][n];
        
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                
                prefix[i][j]=matrix[i][j]+getprefix(i-1,j,prefix)+getprefix(i,j-1,prefix)-getprefix(i-1,j-1,prefix);
            }
        }
        
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
         
        return prefix[row2][col2]-
            getprefix(row1-1,col2,prefix)-
            getprefix(row2,col1-1,prefix)+
            getprefix(row1-1,col1-1,prefix);
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */