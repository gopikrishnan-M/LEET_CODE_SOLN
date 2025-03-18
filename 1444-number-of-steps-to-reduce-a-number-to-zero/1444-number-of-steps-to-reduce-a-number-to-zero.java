class Solution {
    public int numberOfSteps(int n) {
        int steps=0;
        while(n>0){
            if(n%2==0){
                n/=2;
                steps++;
            }
            else{
                n-=1;
                steps++;
            }
        }
        return steps;
        // return helper(num,0);
    }
    public static int helper(int n,int step){
        if(n==0) return step;
        if(n%2==0) return helper(n/2,++step);
        else return helper(n-1,++step);
    }
}