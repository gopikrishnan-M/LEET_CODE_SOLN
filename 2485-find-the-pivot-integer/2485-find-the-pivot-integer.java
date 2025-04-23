class Solution {
    public static int pivotInteger(int n) {
        int pivot=-1;
        int left=n*(n+1)/2;;
        int sub=0;
        int right=0;
        for(int i=0;i<n;i++){
            left=left-sub;
            sub=n-i;
            right=right+sub;
            if(left==right){
                pivot=n-i;
                break;
            }
        }
        return pivot;
    }
}
