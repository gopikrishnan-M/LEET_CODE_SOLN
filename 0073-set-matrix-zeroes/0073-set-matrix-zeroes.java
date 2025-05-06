class Solution {
    public void setZeroes(int[][] mat) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==0){
                    ans.add(i);
                    ans.add(j);
                }
            }
        }
        for(int i=0;i<ans.size();i=i+2){
            replacer(ans.get(i),ans.get(i+1),mat);
        }
    }
    public void replacer(int row,int col,int[][] mat){
        for(int i=0;i<mat[row].length;i++){
            mat[row][i]=0;
        }
        for(int i=0;i<mat.length;i++){
            mat[i][col]=0;
        }
    }
}