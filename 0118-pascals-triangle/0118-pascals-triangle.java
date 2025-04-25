class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            List<Integer> one=new ArrayList<>();
            int number=1;
            for(int col=1;col<=row;col++){
                one.add(number);
                number=number*(row-col)/col;
            }
            ans.add(one);
        }
        return ans;
        
    }

}