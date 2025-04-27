class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (m * n != r * c) return mat;
        int[] temp=new int[m*n];
        int[][] ans=new int[r][c];
        int row=0,col=0;
        int t=0;
        for(int[] arr:mat){
            for(int n:arr){
                temp[t++]=n;
            }
        }
        t=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=temp[t++];
            }
        }
        return ans;
    }
}