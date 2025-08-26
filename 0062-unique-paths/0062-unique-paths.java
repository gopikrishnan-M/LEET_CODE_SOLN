class Solution {
    public int uniquePaths(int m, int n) {
        if(m==1 || n==1){
            return 1;
        }
        int down=uniquePaths(m-1,n);
        int rit=uniquePaths(m,n-1);
        return down+rit;
    }
}