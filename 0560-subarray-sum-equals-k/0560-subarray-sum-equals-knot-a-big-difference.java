class Solution {
    public int subarraySum(int[] arr, int k) {
        int sum=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            arr[i]=sum;
        }
        for(int i=0;i<arr.length;i++){
            int left=(i>0)?arr[i-1]:0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]-left==k) ans++;
            }
        }
        return ans;
    }
}