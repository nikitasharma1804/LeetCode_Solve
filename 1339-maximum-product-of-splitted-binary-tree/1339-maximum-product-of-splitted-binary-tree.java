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
    public int maxProduct(TreeNode root) {
    Long sum = dfs(root);
    long [] ans = new long[1];
    long max = getAns(root,sum,ans);
        return (int)(ans[0]%1000000007);
    }
    public static long dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        long left=dfs(root.left);
        long right=dfs(root.right);
        return left +right + root.val;
    }
    public static long getAns(TreeNode root,long sum, long[]ans){
        if(root==null){
            return 0;
        }
        long left=getAns(root.left,sum,ans);
        long right=getAns(root.right,sum,ans);
        long csum=left + right+root.val;
        ans[0]=Math.max(ans[0],csum*(sum-csum));
        
        return csum;
        
    }
}