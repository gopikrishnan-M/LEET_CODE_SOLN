class Solution {
    public int findNumbers(int[] nums) {
        int res=0;
        for(int num: nums){
            if(isEven(num)){
                res++;
            }
        }
        return res;
        
    }
    boolean isEven(int a){
        int digit=(int)Math.log10(a)+1;
        return digit%2==0;
    }
}