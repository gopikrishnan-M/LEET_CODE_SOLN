class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hs=new HashSet<>();
        for(int n:arr) hs.add(n);
        boolean z=false;
        for(int n:arr) {
            if(z&&n==0) return true;
            if(n==0) z=true;
            else if(hs.contains(n*2)) return true;
        }
        return false;
    }
}