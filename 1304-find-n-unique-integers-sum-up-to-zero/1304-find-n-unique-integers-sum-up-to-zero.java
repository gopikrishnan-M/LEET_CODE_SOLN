class Solution {
    public int[] sumZero(int n) {
        int last=n-1;
        int[] res=new int[n];
        for(int i=0;i<res.length/2;i++){
            res[i]=-n;
            res[last--]=n;
            n--;
        }
        return res;
    }
}