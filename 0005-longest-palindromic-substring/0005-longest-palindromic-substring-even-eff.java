class Solution {
    public String longestPalindrome(String s) {
        int currentLength=0,left=0,right=0;
       for(int i=0;i<s.length();i++){
        int l1=xpand(s,i,i);
        int l2=xpand(s,i,i+1);
        currentLength=Math.max(l1,l2);
        if(currentLength>right-left){
            left=i-(currentLength-1)/2;//the mid value will always be one index ahead as we work with zero indexed array ,string ,etc.............
            right=i+(currentLength)/2;
        }
       }
       return s.substring(left,right+1);//you may know that end of string "is [)" ^_+
    }

    public int xpand(String s,int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right) ){
            left--;
            right++;
        }
        return right-left-1;//here oru twistu to see it look wrong or wierd but the true formula is
        //(right - 1) - (left + 1) + 1 

    }
}