class Solution {
    public int totalHammingDistance(int[] nums) {
        int l=nums.length;
        int total=0;
        for(int i=0;i<32;i++){
            int ones=0;
            for(int n:nums){
                ones+=(n>>i)&1;
            }
            int zeros=l-ones;
            total+=zeros*ones;
        }
        return total;
    }
}