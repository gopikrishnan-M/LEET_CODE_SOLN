class Solution {
    public void sortColors(int[] arr) {
        //this is know as dutch flag sorting algo time wise same but save memory coz no freq array created
        int left=0;
        int mid=0;
        int right=arr.length-1;
        while(mid<=right){
            if(arr[mid]==0) swap(arr,left++,mid++);
            else if(arr[mid]==1) mid++;
            else swap(arr,mid,right--);
        }
    }
    public void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}