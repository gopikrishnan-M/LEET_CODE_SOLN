class Solution {
    public int search(int[] arr, int target) {
        int originalEnd=originalEndFinder(arr);
        int ans=binarySearch(arr,target,0,originalEnd);
        if(ans==-1){
            ans=binarySearch(arr,target,originalEnd+1, arr.length-1);
        }
        return ans;
    }
     public int binarySearch(int[] arr, int target, int start, int end) {
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid] > target) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return ans;
    }
    public int originalEndFinder(int[] arr){
        int start=0;
        int end=arr.length-1;
        int last=end;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[last]){
                //this if statement literally find weather we are in first half or in second half
                start=mid;
                if(arr[mid]<arr[mid+1]){
                    /*in some cases it will give answer without this condition but in most of the cases
                    the loop will never terminate it will continiously assign start= mid where start will always be
                    less than the end */
                    start=mid+1;
                }
                else{
                    end=mid;
                }
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
}