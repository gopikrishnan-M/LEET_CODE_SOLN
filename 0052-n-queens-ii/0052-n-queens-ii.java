class Solution {
    public int totalNQueens(int n) {
        return queens(new boolean[n][n],0);
    }
    public static int queens(boolean[][] board,int row){
        if (row == board.length ) {
            return 1;
        }
        int count=0;
        for(int col=0;col<board.length;col++){
            if(isCorrect(board,row,col)){
                board[row][col]=true;
                count=count+queens(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }

    private static boolean isCorrect(boolean[][] board, int row, int col) {
        //checks the entire row for queen's presence
        for (int i=0;i<board.length;i++){
            if(board[i][col])
                return false;

        }
        //checks top left diagonal
        int leftMax=Math.min(row,col);//these avoids outOfBound exceptions

        for (int i=1;i<=leftMax;i++){
            if(board[row-i][col-i])
                return false;

        }
        //chaecks rop right diagonal
        int rigthMax=Math.min(row,board.length-col-1);//these avoids outOfBound exceptions

        for(int i=1;i<=rigthMax;i++){
            if (board[row-i][col+i])
                return false;

        }

        return true;
    }
}