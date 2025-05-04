class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=minFind(i,matrix);
            if(isMaxCol(min,i,matrix)){
                ans.add(matrix[i][min]);
            }
        }
        return ans;
    }
    public int minFind(int row,int[][] mat){//finds ans return the colvalue of the min element
        int min=Integer.MAX_VALUE,index=0;
        for(int col=0;col<mat[row].length;col++){
            if(mat[row][col]<min){
                min=mat[row][col];
                index=col;
            }
        }
        return index;
    }

    public boolean isMaxCol(int col,int ele,int[][] mat){
        for(int row=0;row<mat.length;row++){
            if(mat[ele][col]<mat[row][col]) return false;
        }
        return true;
    }

}