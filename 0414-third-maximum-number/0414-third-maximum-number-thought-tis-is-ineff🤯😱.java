class Solution {
    public int thirdMax(int[] nums) {
       long fst=Long.MIN_VALUE;
       long snd=Long.MIN_VALUE;
       long trd=Long.MIN_VALUE;
       for(int n:nums){
        if(n>fst){
            trd=snd;
            snd=fst;
            fst=n;
        }
        else if(n>snd && n!=fst){
            trd=snd;
            snd=n;
        }
        else if(n>trd && n!=snd && n!=fst){
            trd=n;
        }
       }
       return trd==Long.MIN_VALUE?(int)fst:(int)trd;
    }
}