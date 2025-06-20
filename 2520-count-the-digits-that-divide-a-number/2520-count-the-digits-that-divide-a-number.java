class Solution {
    public int countDigits(int num) {
        int count=0,dup=num;
        while(dup>0){
            int last=dup%10;
            dup/=10;
            if(num%last==0) count++;
        }
        return count;
    }
}