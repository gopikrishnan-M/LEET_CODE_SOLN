class Solution {
    public int[] plusOne(int[] arr) {
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans=ans*10+arr[i];
        }
        ans++;
         int length=(int) Math.log10(ans);

            int[] plus=new int[length+1];
         int end=plus.length-1;
        while(ans!=0){
            int last=ans%10;
            plus[end--]=last;
            ans/=10;
        }
        return plus;
    
    }

}