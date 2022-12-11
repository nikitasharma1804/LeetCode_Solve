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
    public static class pair{
        int ht ;
        TreeNode node;
        pair(int ht,TreeNode node){
            this.ht=ht;
            this.node=node;
        }
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
    return dfs(root).node;    
    }
    public static pair dfs(TreeNode root){
        if(root==null){
            return new pair(0,null);
        }
        pair left=dfs(root.left);
        pair right=dfs(root.right);
        int ht =Math.max(left.ht,right.ht)+1;
        if(left.ht==right.ht){
            return new pair(ht,root);
        }
        else if(left.ht>right.ht){
            return new pair(ht,left.node);
        }
        else{
            return new pair(ht,right.node);
        }
    }
}