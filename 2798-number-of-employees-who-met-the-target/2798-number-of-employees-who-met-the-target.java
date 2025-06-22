class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int worked=0;
        for(int hour:hours) if(hour>=target) worked++;
        return worked;
    }
}