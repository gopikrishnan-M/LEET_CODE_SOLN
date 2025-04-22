class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> nodup=new HashSet<>();
        for(int num:nums){
            nodup.add(num);
        }
        int i=0;
        for(int num:nodup){
            nums[i++]=num;
        }
        return nodup.size();
    }
}