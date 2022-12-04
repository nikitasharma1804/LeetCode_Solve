class Solution {
    public static class Node{
        Node left=null;
        Node right=null;
       
    }
    public static void insert(Node root, int no){
        Node curr=root;
        int bitIdx=30;
        while(bitIdx>=0){
            int mask = 1<<bitIdx;
            int bit = ( no&mask) >0? 1: 0;
            if(bit==1){
                if(curr.right==null)
                {
                curr.right= new Node();   
                }
                
                curr =curr.right;
            }
            else{
                if(curr.left==null){
                 curr.left= new Node();   
                }
                
                curr =curr.left;
            }
          bitIdx--; 
        }
        
    }
    public static int  find(Node root, int f){
        Node curr=root;
        int ans=0;
        int bitIdx=30;
        while(bitIdx>=0){
           int mask = 1<<bitIdx;
            int bit = (f&mask)>0?1:0;
            if(bit==1){
                if(curr.right!=null){
                   ans|=mask;
                    curr=curr.right;
                }
                else{
                    curr=curr.left;
                }
                
            }
            else{
              if(curr.left!=null){
                   curr=curr.left;
                }
                else{
                    ans|=mask;
                    curr=curr.right;
                }
                 
            }
         bitIdx--;   
        }
       return ans;
        
    }
    
    public int findMaximumXOR(int[] nums) {
        int n =nums.length;
        int ans =0;
        Node root= new  Node();
        for(int val:nums){
            insert(root, val);
        }
        
    for(int i =0;i<n;i++){
        
        int f =Integer.MAX_VALUE^nums[i];
        int val=find(root,f);
        ans =Math.max(nums[i]^val,ans);
    }
        return ans;
    }
}