class Solution {
    public boolean isValidSudoku(char[][] board) {
      for(int row=0;row<9;row++){
            boolean[] rowA=new boolean[9];
            boolean[] colA=new boolean[9];
            boolean[] boxA=new boolean[9];
        for(int col=0;col<9;col++){
            if(board[row][col]!='.'){
                int num=board[row][col]-'1';
                if(rowA[num]){
                    return false;
                }
                rowA[num]=true;
            }

            if(board[col][row]!='.'){
                int num=board[col][row]-'1';
                if(colA[num]){
                    return false;
                }
                colA[num]=true;
            }


            int rI=3*(row/3);
            int cI=3*(row%3);
            int r=rI+(col/3);
            int c=cI+(col%3);
            if(board[r][c]!='.'){
                int num=board[r][c]-'1';
                if(boxA[num]){
                    return false;
                }
                boxA[num]=true; 
            }
        }
      }
      return true;  
    }
}