class Solution {
    public int findMaxLength(int[] nums) {
        //this is a binary array but should not be 0,1 but -1,1
        Map<Integer,Integer> tracker=new HashMap<>();
        tracker.put(0,-1);
        int sum=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) nums[i]=-1;
            sum+=nums[i];
            //if we start with zero again a zero comes then there exist equilibrium
            //similarly start with 10 again 10 comes somewhere there goes the samee
            if(tracker.containsKey(sum)){
                l=Math.max(l,i-tracker.get(sum));
            }
            else{
                tracker.put(sum,i);
            }
        }
        return l;
    }
}