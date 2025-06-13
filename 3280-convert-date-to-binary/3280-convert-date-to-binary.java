class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb=new StringBuilder();
        int l=0;
        for(String s:date.split("-")){
            int n=Integer.parseInt(s);
            sb.append(Integer.toBinaryString(n));
            if(l<2)sb.append('-');
            l++;
        }
    return sb.toString();
    }
}