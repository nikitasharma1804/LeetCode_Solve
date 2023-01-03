class Solution {
    public int minDeletionSize(String[] strs) {
     int count=0;
     int n =strs.length;
        int len =strs[0].length();
        for(int i =0;i<len;i++){
         for(int j =1;j<strs.length;j++){
             char c1= strs[j].charAt(i);
             char c2=strs[j-1].charAt(i);
             if(c2>c1){
                    count++;
                    break;
                }
         }   
        }
   
        return count;
    }
}