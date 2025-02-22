import java.util.Arrays;
class Solution {
    public void moveZeroes(int[] nums) {
    int l=nums.length;
    int values=1;
    int []ans=new int[l];
    for(int i=0;i<l;i++){
        if(nums[i]==0){
            values=0;
            break;
        }
    }
    if(values==0){
     for(int i=0,k=0;i<l;i++){
        if(0!=nums[i]){
        ans[k]=nums[i];
        k++;
        }
        
     } 
    }
    for(int i=0;i<l;i++){
        if(values==0)
        nums[i]=ans[i];
    }
     
    }
}