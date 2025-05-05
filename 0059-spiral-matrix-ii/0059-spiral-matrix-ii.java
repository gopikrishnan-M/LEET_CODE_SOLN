class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
        boundary(ans,1,0,n-1,0,n-1);
        return ans;
    }
    public static void boundary(int[][] ans,int val,int rs,int re,int cs,int ce){
        if(rs>re||cs>ce){//basic just do it
            return;
        }

        //doing what they asked for top row
        for(int i=cs;i<=ce;i++){
            ans[rs][i]=val++;
        }
        rs++;

        //last col
        for(int i=rs;i<=re;i++){
            ans[i][ce]=val++;
        }
        ce--;

        //last row
        if (rs <= re) {
            for(int i=ce;i>=cs;i--){
                ans[re][i]=val++;
            }
            re--;
        }


        if(cs<=ce){
            for(int i=re;i>=rs;i--){
                ans[i][cs]=val++;
            }
            cs++;
        }

        boundary(ans, val, rs, re, cs, ce);

        //we need check in between weather the elements are still
        //there or not so eliminate traversed elements soon after every loop
    }
}
