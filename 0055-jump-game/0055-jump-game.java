class Solution {
    public boolean canJump(int[] nums) {
        int curend=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=curend){
                curend=i;
            }

        }
        return curend==0;
    }       
}
