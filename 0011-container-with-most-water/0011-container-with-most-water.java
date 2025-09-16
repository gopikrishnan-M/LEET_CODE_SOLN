class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0,r=n-1;
        int max=0;
        while(l<r){
            int temp=Math.min(height[l],height[r])*(r-l);
            max=Math.max(max,temp);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return max;
    }
}