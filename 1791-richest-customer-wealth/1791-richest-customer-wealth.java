class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int res=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            res=res>sum?res:sum;
            sum=0;
        }
        return res;
        
    }
}