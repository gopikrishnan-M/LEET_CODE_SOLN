class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans =new StringBuilder();
        int i=num1.length()-1,j=num2.length()-1,rem=0;
        while(i>=0 || j>=0 || rem!=0){
            int a=i>=0?num1.charAt(i--)-'0':0;
            int b=j>=0?num2.charAt(j--)-'0':0;
            int s=(a+b+rem)%10;
            rem=(a+b+rem)/10;
            ans.append(s);
        }
        return ans.reverse().toString();
        
    }
}