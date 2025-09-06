class Solution {
    public int subarraySum(int[] arr, int k) {
        int sum=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            arr[i]=sum;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int subsum=0;
                if(i==0) subsum=arr[j];
                else subsum=arr[j]-arr[i-1];
                if(subsum==k) ans++;
            }
        }
        return ans;
    }
}