
class Solution {
    public int findPoisonedDuration(int[] arr, int duration) {
        int sum = 0;
        int high = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > high) {
                sum += duration;
            } 
            else {
                sum += arr[i] + duration - high;
            }
            high = arr[i] + duration;
        }
        return sum;
    }
}
