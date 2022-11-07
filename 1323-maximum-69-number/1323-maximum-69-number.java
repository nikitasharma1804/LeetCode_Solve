class Solution {
    public int maximum69Number (int num) {
        System.out.println(String.valueOf(num));
     char [] chars = String.valueOf(num).toCharArray();
        int i =0;
        
        while(i<chars.length){
            if(chars[i]-'0'==6){
                chars[i]='9';
                break;
            }
            i++;
        }
        int n =0;
        for(int j =0;j<chars.length;j++){
            n=n*10+chars[j]-'0';
        }
        return n;
    }
}