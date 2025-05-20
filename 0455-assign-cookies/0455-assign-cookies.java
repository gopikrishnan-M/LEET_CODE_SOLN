class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0,b=0,satisfied=0;
        while(c<g.length && b<s.length){
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