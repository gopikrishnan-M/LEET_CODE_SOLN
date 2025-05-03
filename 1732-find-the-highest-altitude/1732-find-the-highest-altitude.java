class Solution {
    public int largestAltitude(int[] gain) {
        int peak=0,adder=0;
        for(int n:gain){
            adder+=n;
            peak=adder>peak?adder:peak;
        }
        return peak;
    }
}