class StreamChecker {
    
    public static class Node{
        Node [] children= new Node[26];
        boolean isEnd =false;
        
    }
     
    private final StringBuilder st ;
    private final Node root;
    
    public StreamChecker(String[] words) {
        root= new Node();
        st = new StringBuilder();
        for(String s:words){
         Node curr= root;
            for(int i =s.length()-1;i>=0;i--){
                char c =s.charAt(i);
                if(curr.children[c-'a']==null){
                   curr.children[c-'a']= new Node (); 
                }
                curr=curr.children[c-'a'];
            }
            curr.isEnd =true;  
        }
    }
    
    public boolean query(char letter) { 
        st.append(letter);
        Node curr =root;
            for(int i =st.length()-1;i>=0;i--){
               char c =st.charAt(i);
                if(curr.children[c-'a']==null){
                   return false; 
                }
                curr=curr.children[c-'a'];
                if(curr.isEnd==true){
                    return true;
                }
            }
            return false;
    }
}

/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */