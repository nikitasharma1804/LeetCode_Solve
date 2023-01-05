class Solution {
    public int findMinArrowShots(int[][] points) {
     // Arrays.sort(points,(a,b)->{ return a[0]-b[0];});
        Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));
    ArrayList<int [] > arr = new ArrayList<>();
        arr.add(points[0]);
        for(int i =1;i<points.length;i++){
            int [] top= arr.get(arr.size()-1);
            if(top[1]<points[i][0]){
                arr.add(points[i]);
            }
        }
        return arr.size();
    }
}