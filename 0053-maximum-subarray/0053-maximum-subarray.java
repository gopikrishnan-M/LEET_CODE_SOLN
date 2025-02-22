class Solution {
    public int maxSubArray(int[] nums) {
    int csum=0;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        csum=Math.max(nums[i],csum+nums[i]);
        max=Math.max(csum,max);
    }
    return max;

    }
}