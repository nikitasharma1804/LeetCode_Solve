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
        int sum;
        int max;
        pair(int sum , int max){
            this.sum=sum;
            this.max=max;
        }
    }
    public int maxPathSum(TreeNode root) {
       return maxsum(root).max;
        
    }
    public static pair maxsum(TreeNode root){
    if(root==null){
           return new pair(0,-1001);
       }
        if(root.left==null&&root.right==null){
            return new pair(root.val,root.val);
        }
        pair left =maxsum(root.left);
        pair right=maxsum(root.right);
        int prev=Math.max(left.sum,right.sum);
        int sum =Math.max(prev,0)+root.val;
        int localmax1=Math.max(left.max,right.max);
        int localmax2=Math.max(sum,left.sum+right.sum+root.val);
        
        
        int max=Math.max(localmax1,localmax2);
        return new pair(sum,max);    
    }
}