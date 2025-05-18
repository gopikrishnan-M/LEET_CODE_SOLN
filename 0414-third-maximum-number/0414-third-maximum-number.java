class Solution {
    public int thirdMax(int[] nums) {
       int n=nums.length;
       Arrays.sort(nums);
       ArrayList<Integer> ans=new ArrayList<>();
       for(int i=0;i<n;i++){
        if(!ans.contains(nums[i])){
            ans.add(nums[i]);
        }
       }   
       int len=ans.size(); 
       return len>2?ans.get(len-3):ans.get(len-1); 
    }
}