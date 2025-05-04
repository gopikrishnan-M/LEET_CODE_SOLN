class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd=0,even=0;
        for(int i=0;i<position.length;i++){
            if((position[i]&1)==1) odd++;
            else even++;
        }
        return Math.min(odd,even);        
    }
}