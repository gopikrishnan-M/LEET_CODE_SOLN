class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<0) return false;
        int s=0,e=30;
        while(s<=e){
            int mid=s+(e-s)/2;
            int val=(int)Math.pow(2,mid);
            if(val==n) return true;
            else if(val<n) s=mid+1;
            else e=mid-1;
        }
        return false;
    }
}