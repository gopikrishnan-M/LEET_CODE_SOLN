class Solution {
    public int hammingDistance(int x, int y) {
        int xr = x ^ y;  
        int count = 0;
        while (xr != 0) {
            count += xr & 1;  
            xr >>= 1;         
        }
        return count;
    }
}