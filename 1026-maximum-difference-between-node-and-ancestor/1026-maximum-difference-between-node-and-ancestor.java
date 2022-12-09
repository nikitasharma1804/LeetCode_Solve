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
        int max ;
        int min;
        pair(int max,int min){
            this.max=max;
            this.min=min;
        }
    }
    public int maxAncestorDiff(TreeNode root) {
        int[] ans = new int[1];
        ans[0]=Integer.MIN_VALUE;
        find(root,ans);
        return ans[0];
    }
    public static  pair find(TreeNode root, int [] ans){
        if(root==null){
            return new pair(Integer.MIN_VALUE,Integer.MAX_VALUE);
        }
        if(root.left==null&&root.right==null){
            return new pair(root.val,root.val);
        }
        pair left =find(root.left,ans);
        pair right =find(root.right,ans);
        int gmax=Math.max(left.max,right.max);
        int gmin=Math.min(left.min,right.min);
        ans[0]=Math.max(ans[0],Math.max(Math.abs(gmax-root.val),Math.abs(gmin-root.val)));
        return new pair(Math.max(gmax,root.val),Math.min(gmin,root.val));
    }
}