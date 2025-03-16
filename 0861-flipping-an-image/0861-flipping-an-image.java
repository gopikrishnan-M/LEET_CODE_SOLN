class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int temp=0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <= (arr[row].length-1)/2; col++) {
                temp=arr[row][col];
                arr[row][col]=arr[row][arr[row].length-1-col]^1;
                arr[row][arr[row].length-1-col]=temp^1;
            }
        }
        return arr;
    }
}