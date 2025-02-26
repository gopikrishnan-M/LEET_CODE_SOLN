class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] res={-1,-1};
        res[0]=firstLastOccurance(arr,target,true);
        if(res[0]!=-1) {
            res[1] = firstLastOccurance(arr, target, false);
        }
        return res;
    }

    private int firstLastOccurance(int[] arr, int target, boolean findFirst) {
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target<arr[mid]){
                high=mid-1;
            } else if (target>arr[mid]) {
                low=mid+1;
            }
            else{
                ans=mid;
                if(findFirst){
                   high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return ans;
        
    }
}