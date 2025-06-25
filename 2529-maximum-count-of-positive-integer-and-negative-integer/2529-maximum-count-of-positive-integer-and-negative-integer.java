class Solution { 
    public int maximumCount(int[] nums) {
        int l = nums.length;
        
        // Find the index of the first non-negative number (here we find first zero or positive number i.e the element next to negatives end)
        int s = 0, e = l;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] < 0) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        int negatives = s;
        
        // Find the index of the first positive number
        s = 0;
        e = l;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] <= 0) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        int positives = l - s;
        
        return Math.max(negatives, positives);
    }
}
