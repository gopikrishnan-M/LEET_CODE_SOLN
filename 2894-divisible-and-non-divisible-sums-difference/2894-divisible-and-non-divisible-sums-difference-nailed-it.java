class Solution {
    public int differenceOfSums(int n, int m) {
       //sum of int from 1 to n that are div by m can be given as sum=m*(k*(k+1)/2) where k=n/m;
       int total=n*(n+1)/2;
       int k=n/m;
       int num2= m*(k*(k+1)/2);
       return total-2*num2;
    }
}