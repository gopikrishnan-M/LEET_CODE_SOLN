class Solution {
    public int splitArray(int[] arr, int m) {
        int start=0;
        int end=0;
        for (int num:arr) {
            start=Math.max(start,num);
            end+=num;
        }

        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int splits=1;
            for(int num:arr){
                if(sum+num>mid){
                    sum=num;
                    splits++;
                }
                else{
                    sum+=num;
                }
            }
            if(splits>m){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
}