class Solution {
    public void rotate(int[] arr, int k) {
        if(arr.length==1||k==0) return;
        int[] res=new int[arr.length];
        k=arr.length-k%arr.length;
        int r=0;
         for(int i=0;i< arr.length;i++){
            res[r++]=arr[k];
            if(k <arr.length-1)
                k++;
            else
                k =0;
        }
        int i=0;
        for(int n:res){
            arr[i++]=n;
        }
        
    }
}