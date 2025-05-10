class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return removeFindPali(i+1,j,s)||removeFindPali(i,j-1,s);
            }
        }
        return true;
    }
    public boolean removeFindPali(int l,int r,String s){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
        }
        return true;
    }

}