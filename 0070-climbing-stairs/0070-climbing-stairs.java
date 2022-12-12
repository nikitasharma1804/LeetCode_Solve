class Solution {
    public int climbStairs(int n) {
    int nex=1;
    int nnex=1;
    for(int i =n-2;i>=0;i--){
        int curr=nex+nnex;
        nnex=nex;
        nex=curr;
    }
        return nex;
    }
}