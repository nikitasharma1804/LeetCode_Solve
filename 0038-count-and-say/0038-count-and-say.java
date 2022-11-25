class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String s = countAndSay(n-1);
        StringBuilder ans= new StringBuilder();
        int i=0;
        while(i<s.length()){
            int j =i;
            char c =s.charAt(i);
            while(j<s.length()&&s.charAt(j)==c){
                j++;
            }
            int len =j-i;
            i=j;
            ans.append(len);
            ans.append(c);
        }
        return ans.toString();
    }
}