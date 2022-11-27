class Solution {
    public int maxScore(int[] cardPoints, int k) {
    int n =cardPoints.length;
        
    int [] lefts=new int [n];
    int [] rights=new int[n];
    lefts[0]=cardPoints[0];
    for(int i =1;i<n;i++){
        lefts[i]=lefts[i-1]+cardPoints[i];
        
    }
    rights[n-1]=cardPoints[n-1];
    for(int i =n-2;i>=0;i--){
        rights[i]=rights[i+1]+cardPoints[i];
        
    }
        int max=Math.max(lefts[k-1],rights[n-k]);
        for(int i =1;i<k;i++){
            int rem=k-i;
            
            max=Math.max(max, lefts[i-1]+rights[n-rem]);
        }
        return max;
    }
}