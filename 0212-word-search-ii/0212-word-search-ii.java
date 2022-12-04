class Solution {
    public static class Node{
        Node[] childrens = new Node[26];
        String str = null;
    }
    public static void insert(Node root, String s){
        
        Node curr=root;
        for(int i =0;i<s.length();i++){
            char c= s.charAt(i);
            if(curr.childrens[c-'a']==null){
               curr.childrens[c-'a']= new Node(); 
            }
            curr=curr.childrens[c-'a'];
        }
        curr.str=s;
    }
    public List<String> findWords(char[][] board, String[] words) {
        Node root= new Node();
       for(String s :words){
           insert(root,s);
       } 
        int m =board.length;
        int n = board[0].length;
        HashSet<String> hs = new HashSet<>();
        
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
            dfs(board,i,j,hs,root);    
            }
        }
        List<String> ans = new ArrayList<>(hs);
        return ans;
    }
    
    public static void dfs(char[][] board,int i, int j , HashSet<String> hs,Node root){
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]=='.'){
            return;
        }
        char c = board[i][j];
        if(root.childrens[c-'a']==null){
            return;
        }
        Node curr= root.childrens[c-'a'];
        if(curr.str!=null){
            hs.add(curr.str);
        }
        board[i][j]='.';
        dfs(board,i-1,j,hs,curr);
        dfs(board,i,j-1,hs,curr);
        dfs(board,i+1,j,hs,curr);
        dfs(board,i,j+1,hs,curr);
        board[i][j]=c;
    }
}