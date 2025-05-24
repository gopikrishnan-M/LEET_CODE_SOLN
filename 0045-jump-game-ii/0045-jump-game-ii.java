class Solution {
    public int jump(int[] arr) {
        int jump=0,max=0,curr=0;
        for(int i=0;i<arr.length-1;i++){
            max=Math.max(max,i+arr[i]);
            if(curr==i){
                jump++;
                curr=max;
                if(curr>=arr.length-1) break;
            }
        }
        return jump;
    }
}