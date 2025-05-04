class Solution {
    public int maximumPopulation(int[][] logs) {
       int[] papu=new int[101];
       //can also use a nested for/while loop to icrement all val from start to end
       //and finally check for the largest element and update the index val
       //index value plus 1950 will be the answer
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