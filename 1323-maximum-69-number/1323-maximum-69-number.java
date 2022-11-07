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
        
        return Integer.parseInt(String.valueOf(chars));
    }
}