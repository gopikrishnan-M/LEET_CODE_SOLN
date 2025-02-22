import java.util.Arrays;
class Solution {
    public int singleNumber(int[] nums) {
     int l=nums.length;
     int result=0;
    //  if(l==1){
    //     result=nums[0];
    //  }
    //  else{
        for(int i=0;i<l;i++){
            result^=nums[i];
        }
    //  }
     
     return(result);
    }
}