class Solution {
    public boolean isThree(int n) {
        if(n<=1) return false;
        int root=(int)Math.sqrt(n);
        return root*root==n && isprime(root);//the number should a square root and it should be prime
    }
    public boolean isprime(int i){
        int c=2;
        if(i<=1) return false;
        while(c*c<=i){
            if(i%c==0) return false;
            c++;
        }
        return true;
    }
}