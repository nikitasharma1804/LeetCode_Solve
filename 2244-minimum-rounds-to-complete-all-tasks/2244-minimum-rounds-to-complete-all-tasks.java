class Solution {
    public int minimumRounds(int[] tasks) {
      HashMap<Integer,Integer> hp = new HashMap<>();
        
        for(int i =0;i<tasks.length;i++){
            hp.put(tasks[i], hp.getOrDefault(tasks[i],0)+1);
            
        }
        int ans =0;
        for(int val:hp.values()){
            
            int rem = val%3;
            int add =val/3;
            ans+=add;
            if(val==1){
                return -1;
            }
            if(rem!=0){
                ans++;
            }
            
        }
        return ans;
    }
}