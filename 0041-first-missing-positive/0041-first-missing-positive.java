class Solution {
    public int firstMissingPositive(int[] arr) {
        int i=0;
        int l=arr.length;
        while(i<l){
            int correct=arr[i]-1;
            if( arr[i]>0  && arr[i]<l && arr[i]!=arr[correct]){
               int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
        for (int j = 0; j <=l ; j++) {
            if(j==l)
                return j+1;
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length;
    }
}