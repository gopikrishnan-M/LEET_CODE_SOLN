class Solution {
    public int divide(int divident, int divisor) {
       if(divident==Integer.MIN_VALUE && divisor==-1){
        return Integer.MAX_VALUE;
       }
       return divident/divisor;
    }
}