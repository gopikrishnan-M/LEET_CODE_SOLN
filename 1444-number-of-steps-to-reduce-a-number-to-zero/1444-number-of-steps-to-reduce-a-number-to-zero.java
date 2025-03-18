class Solution {
    public int numberOfSteps(int num) {
        return helper(num,0);
    }
    public static int helper(int n,int step){
        if(n==0) return step;
        if(n%2==0) return helper(n/2,++step);
        else return helper(n-1,++step);
    }
}