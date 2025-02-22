class Solution {
    public boolean isPalindrome(int x) {
        boolean res=true;
        int num=x;
        int last=0;
        int rev=0;
        while(num!=0){
            last=num%10;
            rev=rev*10+last;
            num/=10;
        }
        if(x<0)
        return false;

        else if(x!=rev)
            return false;
            
        else 
        return true;
        
    }
}