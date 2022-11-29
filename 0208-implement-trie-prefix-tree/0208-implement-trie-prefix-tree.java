class Trie {
    TrieNode root;
    public Trie() {
    root=  new TrieNode(); 
    }
    
    private static class TrieNode{
        TrieNode [] children;
        boolean isEnd;
        public TrieNode(){
          children= new TrieNode[26];
          isEnd = false;      
        }
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

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */