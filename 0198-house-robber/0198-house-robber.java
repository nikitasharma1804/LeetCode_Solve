class Solution {
    public int rob(int[] nums) {
        int n =nums.length;
        int nextdid=nums[n-1];
        int nextnot=0;
        for(int i =n-2;i>=0;i--){
            int currdid=nextnot+nums[i];
            int currnot=Math.max(nextdid,nextnot);
            nextdid=currdid;
            nextnot=currnot;
        }
    return Math.max(nextdid,nextnot);
    }
  
}