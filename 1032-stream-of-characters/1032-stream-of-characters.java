class StreamChecker {
    
    public static class Node{
        Node [] children= new Node[26];
        boolean isEnd =false;
        
        public static void insert(String s,Node root){
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
        public static boolean checkPrefix(StringBuilder st, Node root){
            Node curr =root;
            for(int i =0;i<st.length();i++){
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
    StringBuilder st ;
    Node root;
    
    public StreamChecker(String[] words) {
        root= new Node();
        st = new StringBuilder();
        for(String s:words){
            root.insert(s,root);
        }
    }
    
    public boolean query(char letter) {
        st.insert(0,letter);
        return checkPrefix(st,root);
    }
}

/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */