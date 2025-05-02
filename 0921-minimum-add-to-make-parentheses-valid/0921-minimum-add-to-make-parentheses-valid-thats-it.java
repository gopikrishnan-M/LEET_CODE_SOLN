class Solution {
    public int minAddToMakeValid(String s) {
        int opn=0;
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='(') opn++;
            else{
                if(opn>0) opn--;
                else count++;
            }
        }
        return count+opn;
    }
}