/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "";
        }
    StringBuilder st = new StringBuilder();
        dfs(st,root);
        return st.toString();    
    }
    public static void dfs(StringBuilder st,TreeNode root){
        if(root!=null){
        st.append(root.val+ " ");    
        }
        
        if(root==null){
            return;
        }
        dfs(st,root.left);
        dfs(st,root.right);
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==""){
            return null;
        }
    Queue<Integer> q = new ArrayDeque<>();
        
    String[] arr= data.split(" "); 
     for(String s:arr) {  
         q.add(Integer.valueOf(s));  
         System.out.println(s);
     }  
        return makeTree(q,Integer.MAX_VALUE,Integer.MIN_VALUE);    
    }
     public static TreeNode makeTree(Queue<Integer> q, int max , int min){
         
        if(q.size()==0){
            return null;
        }
         int val = q.peek();
        if(val>max||val<min){
            return null;
        }
        val=q.remove();
        TreeNode r = new TreeNode();
        r.val=val;
        r.left=makeTree(q,r.val,min);
        r.right=makeTree(q,max,r.val);
        return r;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;