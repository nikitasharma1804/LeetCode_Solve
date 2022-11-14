class Solution {
    public String reverseWords(String s) {
     int i =0;
        StringBuilder sb =new StringBuilder();
        String [] arr = s.split(" ");
        for(int k=arr.length-1;k>=0;k--){
            if(!arr[k].isEmpty()){
                if(k!=arr.length-1){
            sb.append(" ");     
            }
            sb.append(arr[k]);
            
               
            }
            
        }
      
        return sb.toString();
    }
}