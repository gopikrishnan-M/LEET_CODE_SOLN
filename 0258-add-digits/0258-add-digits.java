class Solution {
    public int addDigits(int num) {
       return digiAdd(num,0);
        
    }
    public static int digiAdd(int num,int ans){
        if(num%10==num){
            return num;
        }
         while(num>0){
            ans+=num%10;
            num/=10;
        }
        return digiAdd(ans,0);
    }
}