class Solution {
    public int[] fairCandySwap(int[] ace, int[] bob) {
        int ac=0,bc=0;
        for(int n:ace) ac+=n;        
        for(int m:bob) bc+=m;
        HashSet<Integer> find=new HashSet<>();
        for(int b:bob) find.add(b);
        for(int candy:ace){
            int his=candy+(bc-ac)/2;
            if(find.contains(his)) return new int[]{candy,his};
        }
        return new int[]{0,0};
    }
}