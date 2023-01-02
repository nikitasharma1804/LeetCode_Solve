class Solution {
    public boolean isHappy(int ni) {
     HashSet<Long> hs = new HashSet<>();
        long n=ni;
        while(true){
            long sum=0;
            while(n!=0){
                long no = n%10;
                n=n/10;
                sum+=no*no;
            }
            if(sum==1){
                return true;
            }
            if(hs.contains(sum)){
                return false;
            }
            hs.add(sum);
            n=sum;
            
        }
    }
}