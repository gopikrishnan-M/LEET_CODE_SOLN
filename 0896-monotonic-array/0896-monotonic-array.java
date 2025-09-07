class Solution {
    public boolean isMonotonic(int[] nums) {
        return acend(nums) || desc(nums);
    }
    public boolean acend(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
    public boolean desc(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]) return false;
        }
        return true;
    }
}