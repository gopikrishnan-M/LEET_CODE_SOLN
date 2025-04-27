class Solution {
    public List<Integer> majorityElement(int[] arr) {
        Arrays.sort(arr);
        int count=1;
        int n=arr.length;
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<n;i++){
            if( arr[i]==arr[i-1]) {
                count++;
            }
            else{
                if(count>n/3) ans.add(arr[i-1]);
                count=1;
            }
        }
        if(count>n/3) ans.add(arr[n-1]);
        return ans;
    }

}