class Solution {
    public int[] fairCandySwap(int[] ace, int[] bob) {
        int ac=0,bc=0,al=ace.length,bl=bob.length;
        for(int n:ace) ac+=n;        
        for(int m:bob) bc+=m;
        for(int i=0;i<al;i++){
            for(int j=0;j<bl;j++){
                if((ac-ace[i]+bob[j])==(bc-bob[j]+ace[i])) return new int[] {ace[i],bob[j]};
            }
        } 
        return new int[]{0,0};       
    }
}