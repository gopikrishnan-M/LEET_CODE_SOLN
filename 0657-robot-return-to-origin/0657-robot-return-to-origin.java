class Solution {
    public boolean judgeCircle(String s) {
        int ud=0,lr=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='U') ud++;
            if(s.charAt(i)=='D') ud--;
            if(s.charAt(i)=='R') lr++;
            if(s.charAt(i)=='L') lr--;
        }
        return ud==0&&lr==0;
    }
}