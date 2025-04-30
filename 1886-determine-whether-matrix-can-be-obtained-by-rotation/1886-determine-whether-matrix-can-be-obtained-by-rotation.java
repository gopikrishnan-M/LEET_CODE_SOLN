class Solution {
    public  boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        for(int rot=0;rot<4;rot++){
            rotation(mat);
            if(checker(mat,target)) return true;
        }
        return false;        
    }
    public boolean checker(int[][] mat,int[][] target){
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j]) return false;
            }
        }
        return true;
    }

    public  void rotation(int[][] mat) {
        int n=mat.length;
        //transpose of matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        
        //then reverse it by row to rotate it
        for(int i=0;i<n;i++){
            int last = n-1;
            for(int j=0;j<n/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][last];
                mat[i][last--]=temp;
            }
        }
    }
}