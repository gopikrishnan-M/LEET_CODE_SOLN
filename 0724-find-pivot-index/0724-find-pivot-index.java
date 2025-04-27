class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int left=0;
        int right=0;
        
        for(int i=0;i<n;i++){
            if(i>0)
            left+=nums[i-1];
            right=sum-nums[i]-left;
            if(left==right) return i;
        }
        return -1;
    }
}