class Solution {
    public boolean isValidSerialization(String preorder) {
    
    String[] values= preorder.split(",");
    Queue<String> q= new ArrayDeque<>();
    for(String s:values){
        q.add(s);
    }
        
        return (dfs(q)&&q.size()==0);
    }
    
    public static boolean dfs(Queue<String> q){
        if(q.size()==0){
            return false;
        }
        String value =q.remove();
        if(value.equals("#")){
            return true;
        }
       
        boolean left =dfs(q);
        boolean right= dfs(q);
        
        return (left&&right);
    }
}