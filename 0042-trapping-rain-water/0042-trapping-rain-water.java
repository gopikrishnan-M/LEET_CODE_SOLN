class Solution {
    public int trap(int[] arr) {
        int s=0;
        int e=arr.length-1;
        int unit=0;
        int Ltall=0;
        int Rtall=0;

        while(s<e){
            if(arr[s]<arr[e]){
                if(arr[s]<Ltall){
                    unit=unit+Ltall-arr[s];
                }
                else{
                    Ltall=arr[s];
                }
                s++;
            }
            else{
                if(arr[e]<Rtall){
                    unit=unit+Rtall-arr[e];
                }
                else{
                    Rtall=arr[e];
                }
                e--;
            }
        }
        return unit;
    }
}