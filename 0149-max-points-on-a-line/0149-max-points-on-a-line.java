class Solution {
    public int maxPoints(int[][] points) {
        int max=0;
        for(int i =0;i<points.length;i++){
            HashMap<Double,Integer> hp=new HashMap<>();
            for(int j=0;j<points.length;j++){
                if(j==i){
                    continue;
                }
                double slope=0;
                if(points[i][1]==points[j][1]){
                 slope=0;   
                }
                else if(points[i][0]==points[j][0]){
                 slope=20001;   
                }
                else{
                 slope=(double)(points[i][0]-points[j][0])/(double)(points[i][1]-points[j][1]);
                }
                hp.put(slope,hp.getOrDefault(slope,0)+1);
                max=Math.max(hp.get(slope),max);
            }
        }
        
        return max+1;
        
    }
}