class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0;
        int max=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
        res++;
        max=max>res?max:res;
        }
        else{
        res=0;}
      } 
      return max; 
    }
}