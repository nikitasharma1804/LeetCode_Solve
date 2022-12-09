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
    
        
        StringBuilder st = new StringBuilder();
        dfs(st,root);
        return st.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
    Queue<Integer> q = new ArrayDeque<>();
        
    String[] arr= data.split(" "); 
     for(String s:arr) {  
         q.add(Integer.valueOf(s));  
     }  
        return makeTree( q);
    }
    public static TreeNode makeTree(Queue<Integer> q){
        if(q.size()==0){
            return null;
        }
        if(q.peek()==2000){
            q.remove();
            return null;
        }
        TreeNode r = new TreeNode();
        r.val=q.remove();
        r.left=makeTree(q);
        r.right=makeTree(q);
        return r;
    }
    public static void dfs(StringBuilder st,TreeNode root){
        if(root!=null){
        st.append(root.val+ " ");    
        }
        
        if(root==null){
            st.append(2000+" ");
            return;
        }
        dfs(st,root.left);
        dfs(st,root.right);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));