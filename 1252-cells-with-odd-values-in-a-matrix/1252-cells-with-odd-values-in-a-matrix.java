class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans=new int[m][n];
        int count=0;
        for(int[] pair:indices){
            rowAdder(ans,pair[0]);
            colAdder(ans,pair[1]);
        }
        for(int[] arr:ans){
            for(int num:arr){
                if((num&1)==1) count++; 
            }
        }
        return count;
    }
    public void rowAdder(int[][] ans,int row){
        for(int col=0;col<ans[row].length;col++){
            ans[row][col]++;
        }
    }
    public void colAdder(int[][] ans,int col){
        for(int row=0;row<ans.length;row++){
            ans[row][col]++;
        }
    }
}