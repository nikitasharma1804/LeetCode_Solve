class Solution {
    public String makeGood(String s) {
        if(s.isEmpty()||s.length()==1){
            return s;
        }

        
        while(true){
            boolean flag =false;
            int i=0;
            StringBuilder sb = new StringBuilder();
        while(i<=s.length()-1){
            if(i==s.length()-1){
                sb.append(s.charAt(i));
                i++;
            }
            else if(s.charAt(i)-s.charAt(i+1)==32||s.charAt(i)-s.charAt(i+1)==-32){
                i+=2;
                flag=true;
            }
            else{
                sb.append(s.charAt(i));
                i++;
            }
        }    
            s=sb.toString();
            System.out.println(s);
            if(flag==false){
                return s;
            }
            
        }
      
     
    }
}