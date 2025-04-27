class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (m * n != r * c) return mat;
        int[][] ans=new int[r][c];
        int row=0,col=0;
        int t=0;
        for(int[] arr:mat){
            for(int num:arr){
                ans[row][col++]=num;
                if(col==c){
                    col=0;
                    row++;
                }
            }
        }
        return ans;
    }
}