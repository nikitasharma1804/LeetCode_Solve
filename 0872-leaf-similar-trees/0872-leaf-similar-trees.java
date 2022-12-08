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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    ArrayList<Integer> a1 = new ArrayList<>();
    ArrayList<Integer> a2 = new ArrayList<>();
    dfs(root1,a1);
    dfs(root2,a2);
        return a1.equals(a2);
    }
    public static void dfs(TreeNode root,ArrayList<Integer> a ){
        
        if(root==null){
            return ;
        }
        if(root.left==null&&root.right==null){
            a.add(root.val);
            return;
        }
        dfs(root.left,a);
        dfs(root.right,a);
    }
}