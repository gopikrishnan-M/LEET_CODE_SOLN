import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
     Arrays.sort(nums);
     Boolean flag=false;
     for(int i =0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            flag=true;
        }
        }
        return(flag);   
    }

}