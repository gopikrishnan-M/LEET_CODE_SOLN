class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> one=new HashSet<>();
        for(int n:nums1){
            one.add(n);
        }
        Set<Integer> res=new HashSet<>();
        for(int n:nums2){
            if(one.contains(n)){
                res.add(n);
            }
        }
        int[] result=new int[res.size()];
        int i=0;
        for(int n:res){
            result[i++]=n;
        }
        return result;
    }
}