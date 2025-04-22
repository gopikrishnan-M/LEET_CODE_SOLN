class Solution {
    public int removeDuplicates(int[] arr) {
       int k=1;
       if( arr.length == 0) return 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[k-1]){
                arr[k++]=arr[i];
            }
        }
        return k;
    }
}