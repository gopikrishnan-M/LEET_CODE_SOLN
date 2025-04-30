class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] srt=nums.clone();
        Arrays.sort(srt);
        int s=0,e=nums.length-1;
        while(s<nums.length&& srt[s]==nums[s]) s++;
        while(e>s&& srt[e]==nums[e]) e--;
        return e-s+1;

    }
}