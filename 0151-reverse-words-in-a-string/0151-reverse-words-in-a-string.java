class Solution {
    public String reverseWords(String s) {
     int i =0;
        StringBuilder sb =new StringBuilder();
        ArrayList<String> arr=new ArrayList<>();
        while(i<s.length()){
            while(i<s.length()&&s.charAt(i)==' '){
                i++;
                
            }
            int j =i;
            while(j<s.length()&&s.charAt(j)!=' '){
                j++;
            }
            String st=s.substring(i,j);
                 System.out.println(st);
            if(!st.isEmpty()){
            arr.add(st);
            }
            i=j;
        }
        for(int k=arr.size()-1;k>=0;k--){
       
            sb.append(arr.get(k));
            if(k!=0){
            sb.append(" ");    
            }
            
        }
        return sb.toString();
    }
}