class Solution {
    public int dominantIndex(int[] nums) {
        int largest=nums[0];
        int index=0;
        for(int i=1;i<nums.length;i++){
            if(largest<nums[i]) {
                largest=nums[i];
                index=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i==index) continue;
            if(largest<2*nums[i]) return -1;
        }
        return index;
    }
}