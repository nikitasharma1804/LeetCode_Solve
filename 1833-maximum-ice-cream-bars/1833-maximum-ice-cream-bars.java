class Solution {
    public int maxIceCream(int[] costs, int coins) {
    Arrays.sort(costs);
    int no=0;
        int i =0;
    while(i<costs.length&& coins>0){
    if(costs[i]>coins){
        break;
    }   
        else{
            
            coins-=costs[i];
            i++;
            no++;
        }
    }
        return no;
    }
}