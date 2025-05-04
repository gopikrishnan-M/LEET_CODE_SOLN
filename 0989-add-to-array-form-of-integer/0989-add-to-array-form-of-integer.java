class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i=num.length-1;
        List<Integer> ans=new ArrayList<Integer>();
        while(i>=0||k>0){
            if(i>=0){
                k+=num[i--];
            }
            ans.addFirst(k%10);
            k/=10;

        }
        return ans;
    }
}