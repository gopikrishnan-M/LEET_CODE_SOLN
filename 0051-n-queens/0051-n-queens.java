class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board=new boolean[n][n];
        return queens(board,0);
    }

    public static List<List<String>> queens(boolean[][] board,int row){
        List<List<String>> ans=new ArrayList<>();//no need to pass in argument coz we will add all
        if (row == board.length ) {
            ans.add(displayChess(board));
            return ans;//when base condition is met then one answer returned;
        }
        for(int col=0;col<board.length;col++){
            if(isCorrect(board,row,col)){  //we try to keep queen in every column
                board[row][col]=true;//if it is correct then place the queen 
                ans.addAll(queens(board,row+1));
                //then call for next row by adding it by one and add all the ans returned by thebelow calls
                board[row][col]=false;// this step is for backtracking
            }
        }
        return ans;
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

    private static List<String> displayChess(boolean[][] board) {
        //for making the boolean matrix into a list 
        List<String> one=new ArrayList<>();
        for (boolean[] arr:board){
            StringBuilder s=new StringBuilder();
            for (boolean element: arr){
                if (element) s.append('Q');
                else s.append('.');
            }
            one.add(s.toString());
        }
        return one;
    }  
}
