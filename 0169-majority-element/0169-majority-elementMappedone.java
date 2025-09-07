class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        int l=nums.length;
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
            if(freq.get(nums[i])> l/2){
                return nums[i];
            }
        }
        return -1;
    }
}