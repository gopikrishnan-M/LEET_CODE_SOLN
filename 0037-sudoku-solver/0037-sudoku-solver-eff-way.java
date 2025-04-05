class Solution {
    public void solveSudoku(char[][] board) {
        helper(board);
    }
    private boolean helper(char[][] board){
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]=='.'){
                    for(char i='1';i<='9';i++){
                        if(isCorrect(i,board,row,col)){
                            board[row][col]=i;
                            if(helper(board)){
                                return true;
                            }
                            board[row][col]='.';
                        }
                    }
                    return false;
                }
            }

        }
     return true;
    }

    private static boolean isCorrect(char num,char[][] board,int row,int col){
        for(int i=0;i<9;i++){
            if(board[row][i]==num|| board[i][col]==num){
                return false;
            }
        }
        int rowStart=row-row%3;
        int colStart=col-col%3;
        for(int i=rowStart; i< rowStart+3 ;i++){
            for(int j=colStart; j< colStart +3 ;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        
        return true;
    }
}
