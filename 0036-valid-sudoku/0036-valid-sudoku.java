class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(board[row][col]=='.'){
                     for(char i='1';i<='9';i++){
                        if(isCorrect(i,board,row,col)){
                            board[row][col]=i;
                            if(isValidSudoku(board)){
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
        for(int i=0;i<board.length;i++){
            if(board[row][i]==num||board[i][col]==num){
                return false;
            }
        }
        
        int rowStart=row-row%3;
        int colStart=col-col%3;
        for(int i=rowStart; i< rowStart+3;i++){
            for(int j=colStart; j< colStart +3 ;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        
        return true;
    }
}