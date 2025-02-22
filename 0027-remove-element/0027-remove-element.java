import java.util.Arrays;
class Solution {
    public int removeElement(int[] nums, int val) {
        int l=nums.length; 
        int k=0;
        for(int i=0;i<l;i++){
            if(val!=nums[i]){
            nums[k]=nums[i]; 
            k++;
          }}
        return(k);
    }
}