class Solution {
    public int rob(int[] arr) {
        int n=arr.length;
        if(n==1) return arr[0];
        if(n==2) return Math.max(arr[0],arr[1]);
        int[] greedy=new int[n];
        greedy[0]=arr[0];
        greedy[1]=Math.max(arr[0],arr[1]);
        for (int i = 2; i < n; i++) {
            greedy[i]=Math.max(greedy[i-1],greedy[i-2]+arr[i]);
        }
        return greedy[n-1];
    }
}