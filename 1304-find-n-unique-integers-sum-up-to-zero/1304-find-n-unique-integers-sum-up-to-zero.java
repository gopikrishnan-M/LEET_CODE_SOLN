class Solution {
    public int[] sumZero(int n) {
        int[] ans =new int[n];
        int last=n-1;
        for(int i=0;i<ans.length/2;i++){
            n--;
            ans[last--]=n;
            ans[i]=-n;
        }
        return ans;
    }
    
}