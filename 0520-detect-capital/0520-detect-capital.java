class Solution {
    public boolean detectCapitalUse(String word) {
        int small=0;
        int cap=0;
    for(int i =0;i<word.length();i++){
        char c =word.charAt(i);
        if(c>='a'&&c<='z'){
            small++;
        }
        else{
            cap++;
        }
    } 
        if(cap==word.length()||small==word.length()){
            return true;
        }
        else if(small==word.length()-1&&(word.charAt(0)>='A'&&word.charAt(0)<='Z')){
            return true;
        }
            else{
                return false;
            }
    }
}