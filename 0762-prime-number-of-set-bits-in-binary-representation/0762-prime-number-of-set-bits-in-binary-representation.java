class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        for(int i=left;i<=right;i++){
            if(isPrime(setBits(i))) ans++;
        }
        return ans;
    }
    public int setBits(int n){
        int count=0;
        while(n>0){
            count+=n&1;
            n=n>>1;
        }
        return count;
    }
    public boolean isPrime(int i) {
        int c=2;
        if(i<=1){
            return false;
        }
        while(c*c<=i){
            if(i%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}