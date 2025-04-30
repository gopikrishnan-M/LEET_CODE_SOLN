class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int lng=1;
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]) lng++;
            else {
                max=max>lng?max:lng;
                lng=1;
            }
        }
        max=max>lng?max:lng;
        return max;
    }
}