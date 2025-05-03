class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int j=0,s=n;
        for(int i=0;i<nums.length;i+=2){
            ans[i]=nums[j++];
            ans[i+1]=nums[s++];
        }
        return ans;
    }
}