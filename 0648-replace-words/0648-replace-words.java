class Solution {
    public static class TrieNode{
        TrieNode [] children;
        boolean isEnd;
        public TrieNode(){
          children= new TrieNode[26];
          isEnd = false;      
        }
    }
    class Trie {
    TrieNode root;
    public Trie() {
    root=  new TrieNode(); 
    }
    
    
    public void insert(String word) {
        int len= word.length();
        TrieNode curr= root;
        
        for(int i =0;i<len;i++){
            char c=word.charAt(i);
            int idx = c-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new TrieNode();
                
            }
            curr=curr.children[idx];
            
        }
        curr.isEnd=true;
    }
    
    public boolean search(String word) {
     int len= word.length();
        TrieNode curr= root;
        
        for(int i =0;i<len;i++){
            char c=word.charAt(i);
            int idx = c-'a';
            if(curr.children[idx]==null){
                return false;
                
            }
            curr=curr.children[idx];
            
        }
       return curr.isEnd==true;  
        
    }
    
    public boolean startsWith(String prefix) {
    int len= prefix.length();
        TrieNode curr= root;
        
        for(int i =0;i<len;i++){
            char c=prefix.charAt(i);
            int idx = c-'a';
            if(curr.children[idx]==null){
                return false;
                
            }
            curr=curr.children[idx];
            
        }
       return true;     
    }
}
    public String replaceWords(List<String> dictionary, String sentence) {
        
        Trie t = new Trie();
        for(String s:dictionary){
            t.insert(s);
        }
        List<String> ans = new ArrayList<>();
        String [] arr = sentence.split(" ");
        for(String s :arr){
            TrieNode curr=t.root;
            String a="";
            for(int i =0;i<s.length();i++){
               char c= s.charAt(i);
                int idx =c-'a';
                if(curr.children[idx]==null){
                a="";
                    break;
                }
                a+=c;
                if(curr.children[idx].isEnd==true){
                    break;
                }
                curr=curr.children[idx];
            }
            if(a==""){
                ans.add(s);
            }
            else{
                ans.add(a);
            }
            
        }
        return String.join(" ",ans);
    }
}