class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> one=new ArrayList<>();
        long num=1;
        for(int col=1;col<=rowIndex+1;col++){
            one.add((int)num);
            num=num*(rowIndex+1-col)/col;
        }        
    return one;
    }
}