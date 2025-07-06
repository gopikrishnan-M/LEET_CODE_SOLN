class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return helper(new ArrayList<>(),nums);
    } 
    public List<List<Integer>> helper(List<Integer> p, int[] up) {
        List<List<Integer>> ans = new ArrayList<>();
        if (up.length == 0) {
            ans.add(new ArrayList<>(p));
            return ans;
        }
        int first = up[0];
        int[] rest = Arrays.copyOfRange(up, 1, up.length);

        for (int i = 0; i <= p.size(); i++) {
            List<Integer> temp = new ArrayList<>(p);
            temp.add(i, first); // insert at position i
            ans.addAll(helper(temp, rest));
        }

        return ans;
    }
}