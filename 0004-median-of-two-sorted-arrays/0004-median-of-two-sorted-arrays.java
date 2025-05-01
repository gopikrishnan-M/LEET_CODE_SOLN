class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        double[] merged=new double[n+m];

        //merge arrays
        int r=0,i=0,j=0;
        while(i<n&&j<m){
            if(nums1[i]<nums2[j]) merged[r++] = nums1[i++];
            else merged[r++]=nums2[j++];
        }
        while(i<n) merged[r++]=nums1[i++];
        while(j<m) merged[r++]=nums2[j++];

        //handle mid
        int mid=(n+m)/2;
        if ((m+n)%2!=0) return merged[mid]; //if odd just return mid
        else{
            return (merged[mid-1]+merged[mid])/2;//this works if it is even
        }
    }

}