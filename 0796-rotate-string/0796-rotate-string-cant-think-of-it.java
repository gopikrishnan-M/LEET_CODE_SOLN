class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;

        String dup=s+s;
        if(dup.contains(goal)) return true;
        return false;

        //s.length() == goal.length() && (s + s).contains(goal);
    }
}