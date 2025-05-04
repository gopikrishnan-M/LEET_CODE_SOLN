class Solution {
    public int maximumPopulation(int[][] logs) {
       int[] papu=new int[101];
       for(int[] person:logs){
        papu[person[0]-1950]++;
        papu[person[1]-1950]--;
       }
       int curr=0,max=0,year=1950;
       for(int i=0;i<101;i++){
        curr+=papu[i];
        if(curr>max){
            max=curr;
            year=1950+i;
        }
       }
       return year;
    }
}