class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        String longest="";
       for(int i=0;i<s.length();i++){
        String t1=xpand(s,i,i);
        int l1=t1.length();
        String t2=xpand(s,i,i+1);
        int l2=t2.length();
        if(l1>l2){
            if(l1>max){
                max=l1;
                longest=t1;
            }
        }
        else{
            if(l2>max){
                max=l2;
                longest=t2;
            }
        }
       }
       return longest; 
    }

    public String xpand(String s,int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right) ){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}