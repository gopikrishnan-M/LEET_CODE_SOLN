class Solution {
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        do{
            slow=powerPandy(slow);
            fast=powerPandy(powerPandy(fast));
        }while(fast!=slow);
        if(slow==1){
            return true;
        }
        return false;
    }
    public static int powerPandy(int num){
        int pow=0;
        while (num!=0){
            int last=num%10;
            pow+=last*last;
            num/=10;
        }
        return pow;
    }
}