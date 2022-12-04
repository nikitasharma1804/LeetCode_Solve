class Solution {
    public int minimumAverageDifference(int[] nums) {
    int n = nums.length;
    long sum=0;
    int idx=0;
    long ans =Long.MAX_VALUE;
    for(int i=0;i<n;i++){
        sum+=nums[i];
        
    }
        
    
       long currsum=0;
        for(int i=0;i<n;i++){
            currsum+=nums[i];
        long ls=currsum/Math.max(1,i+1);
        long rs=(sum-currsum)/Math.max(n-i-1,1);
            if(Math.abs(ls-rs)<ans){
                ans=Math.abs(ls-rs);
                idx=i;
            }
       
            
        }
        return idx;
    }
}