class Solution {
    public int minimumAverageDifference(int[] nums) {
    int n = nums.length;
    long [] left = new long [n];
    long [] right = new long[n];
    left[0]=nums[0];
        int idx=0;
    long ans =Long.MAX_VALUE;
    for(int i=1;i<n;i++){
        left[i]=left[i-1]+nums[i];
        
    }
    for(int i=n-2;i>=0;i--){
        right[i]=right[i+1]+nums[i+1];   
    }
        for(long val:right){
            System.out.println(val);
        }
        for(int i=0;i<n;i++){
        long ls=left[i]/Math.max(1,i+1);
        long rs=right[i]/Math.max(n-i-1,1);
            if(Math.abs(ls-rs)<ans){
                ans=Math.abs(ls-rs);
                idx=i;
            }
       
            
        }
        return idx;
    }
}