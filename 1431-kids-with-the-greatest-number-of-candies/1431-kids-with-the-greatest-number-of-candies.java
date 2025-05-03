class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        int max=0;
        for(int n:candies){
            max=max<n?n:max;
        }
        for(int n:candies){
            if(n+extraCandies>=max) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}