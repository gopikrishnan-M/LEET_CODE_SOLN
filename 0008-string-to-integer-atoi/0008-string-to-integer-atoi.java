class Solution {
    public int myAtoi(String s) {
        int i=0,n=s.length(),sign=1;
        long res=0;
        
        while(i<n&&s.charAt(i)==' ') i++;

        if(i<n&&(s.charAt(i)=='+'||s.charAt(i)=='-')){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }

        while(i<n&&Character.isDigit(s.charAt(i))){
            int val=s.charAt(i)-'0';
            res=res*10+val;
            if(res*sign<=Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(res*sign>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }
        return (int)(sign*res);
    }
}