class Solution {
    public int[] findErrorNums(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]==arr[correct]){
                i++;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
        }
        
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                return new int[] {arr[j],j+1} ;
            }
        }
        return new int[]{-1,-1};
    }
}