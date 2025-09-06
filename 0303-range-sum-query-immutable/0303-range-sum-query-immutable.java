class NumArray {
    private int[] sumarr;
    public NumArray(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        sumarr=nums;
    }
    public int sumRange(int left, int right) {
        if(left==0) return sumarr[right];
        return sumarr[right]-sumarr[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */