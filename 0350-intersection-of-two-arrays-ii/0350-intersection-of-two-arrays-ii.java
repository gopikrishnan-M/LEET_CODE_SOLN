class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       List<Integer> one=new ArrayList<>();
        for(int n:nums2){
            one.add(n);
        }
        List<Integer> res=new ArrayList<>();
        for(int n:nums1){
            if(one.contains(n)){
                res.add(n);
                one.remove((Integer) n);
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