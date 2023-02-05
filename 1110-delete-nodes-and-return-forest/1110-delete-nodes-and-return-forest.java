/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> hs = new HashSet<>();
        for(int val:to_delete){
            hs.add(val);
            
        }
        List<TreeNode> ans= new ArrayList<>();
       TreeNode waste= dfs(root,hs,ans);
        if(waste!=null){
            ans.add(root);
        }
        
        
        return ans;
    }
    public static TreeNode dfs(TreeNode root,HashSet<Integer> hs,List<TreeNode> ans){
        
        if(root==null){
            return null;
        }
        root.left=dfs(root.left,hs,ans);
        root.right=dfs(root.right,hs,ans);
        if(hs.contains(root.val)){
            if(root.left!=null){
            ans.add(root.left);    
            }
            if(root.right!=null){
            ans.add(root.right);    
            }
            return null;
        }
        return root;
    }
}