class Solution {
    public int majorityElement(int[] arr) {
        int count=0;
        int num=arr[0];
        for(int i=0;i<arr.length;i++){
            if(count==0){
                num=arr[i];
                count=1;
            }
            else if(num==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return num;
    }
}