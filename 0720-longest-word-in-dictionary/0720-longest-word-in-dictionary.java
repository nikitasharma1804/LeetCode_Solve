class Solution {
    
    public class Node{
        Node[] childrens = new Node[26];
        boolean isEnd=false;
        String isString= "";
        
    }
    
    public String longestWord(String[] words) {
        Node root = new Node();
        
        
        for(String s : words){
           Node curr = root;
            for(int i =0;i<s.length();i++){
                char c = s.charAt(i);
                if(curr.childrens[c-'a']==null){
                   curr.childrens[c-'a']= new Node(); 
                }
                curr=curr.childrens[c-'a'];
            }
            curr.isEnd = true;
            curr.isString =s;
        }
        String[] max = new String[1];
        max[0]="";
        
       
        dfs(root,max);
        
        return max[0];
    }
    public static void dfs(Node root , String[] max ){
        for(Node c:root.childrens){
            if(c!=null&&c.isEnd ==true){
             if(c.isString.length()>max[0].length()){
              max[0]=c.isString;
              }
               dfs(c,max);
            }
        }
       
        
    }
}