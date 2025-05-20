class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0,b=0,satisfied=0,G=g.length,S=s.length;
        while(c<G&& b<S){
            if(s[b]>=g[c]){
                satisfied++;
                b++;
                c++;
            }
            else b++;
        }
        return satisfied;
    }
}