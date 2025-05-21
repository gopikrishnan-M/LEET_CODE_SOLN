class Solution {
    public int[] fairCandySwap(int[] ace, int[] bob) {
        int ac=0,bc=0,al=ace.length,bl=bob.length;
        for(int n:ace) ac+=n;        
        for(int m:bob) bc+=m;
        int i=0,j=0;
        while(i<al){
            if(j>=bl){
                j=0;
                i++;
            }
            if(bob[j]==ace[i]+(bc-ac)/2) return new int[] {ace[i],bob[j]};
            else j++;
        }
        return new int[]{0,0};
    }
}