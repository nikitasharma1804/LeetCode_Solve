class Solution {
    public String alphabetBoardPath(String target) {
    int [][] board = {{0,1,2,3,4},{5,6,7,8,9},{10,11,12,13,14},
                      {15,16,17,18,19},{20,21,22,23,24},{25}};
        
        int i =0;
        int cr =0;
        int cc=0;
        String ans="";
        while(i<target.length()){
            char ch= target.charAt(i);
            int c =ch-'a';
            int r = c/5;
            int co =c%5;
            while(cc>co){
                ans+='L';
                cc--;
            }
            while(cr<r){
                ans+='D';
                cr++;
            }
            while(cr>r){
                ans+='U';
                cr--;
            }
            while(cc<co){
                ans+='R';
                cc++;
            }
            
            ans+='!';
            i++;
        }
        return ans;
    }
}