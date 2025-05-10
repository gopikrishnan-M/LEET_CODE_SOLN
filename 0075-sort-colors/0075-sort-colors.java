class Solution {
    public void sortColors(int[] arr) {
        int[] freq=new int[3];
        for(int n:arr){
            freq[n]++;
        }
        int i=0,j=0;
        while(i<arr.length){
            if(freq[j]>0){
                arr[i++]=j;
                freq[j]--;
            }
            else{
                j++;
            } 
        }
    }
}