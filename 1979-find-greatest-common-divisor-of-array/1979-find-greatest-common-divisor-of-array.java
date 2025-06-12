class Solution {
    public int findGCD(int[] nums) {
       int min=nums[0],max=nums[0];
       for(int num:nums){
        if(min>num) min=num;
        if(max<num) max=num;
       }
        return hcf(max,min);
    }
    public int hcf(int a,int b){
        if(a%b==0)return b;
        return hcf(b,a%b);
    }
}