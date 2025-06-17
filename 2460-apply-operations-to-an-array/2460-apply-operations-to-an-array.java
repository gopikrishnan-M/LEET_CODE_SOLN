class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                nums[i-1]=2*nums[i-1];
                nums[i]=0;
            }
        }
        int nz=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) nums[nz++]=nums[i];
        }
        for(int i=nz;i<nums.length;i++) nums[i]=0;

        return nums;
    }
}