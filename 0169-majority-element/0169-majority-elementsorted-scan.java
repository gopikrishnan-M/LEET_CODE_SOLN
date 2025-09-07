class Solution {
        public static int majorityElement(int[] arr) {
        Arrays.sort(arr);
        int count=0;
        int val=arr[0];
        int maxcount=0;
        int maxval=0;
        for(int i=0;i<arr.length;i++){
            if(val==arr[i] ) {
                count++;
            }
            else{
                if(maxcount<count){
                    maxcount=count;
                    maxval=val;
                }
                val=arr[i];
                count=1;
            }
        }
        if(maxcount<count){
            maxcount=count;
            maxval=val;
        }

        return maxval;
    }

}