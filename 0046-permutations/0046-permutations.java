class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return posibilities(new ArrayList<Integer>(),nums,0);
    }
    private static List<List<Integer>> posibilities(List<Integer> p, int[] arr, int track) {
        List<List<Integer>> ans=new ArrayList<>();
        if(track==arr.length){
            ans.add(new ArrayList<>(p));
            return ans;
        }
        int a=arr[track++];
        for(int i=0;i<=p.size();i++){
            p.add(i,a);
            ans.addAll(posibilities(p,arr,track));
            p.remove(i);
        }
        return ans;
    }
}
