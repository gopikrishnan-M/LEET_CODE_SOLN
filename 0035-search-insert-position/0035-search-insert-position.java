class Solution {
    public int searchInsert(int[] arr, int target) {
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(target==arr[m]) return m;
            else if(target<arr[m]) e=m-1;
            else s=m+1;
        }
        return s;

    }

}