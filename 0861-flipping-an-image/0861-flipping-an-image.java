class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <= (arr[row].length-1)/2; col++) {
                int temp=arr[row][col]^1;
                arr[row][col]=arr[row][arr[row].length-1-col]^1;
                arr[row][arr[row].length-1-col]=temp;
            }
        }
        return arr;
    }
}