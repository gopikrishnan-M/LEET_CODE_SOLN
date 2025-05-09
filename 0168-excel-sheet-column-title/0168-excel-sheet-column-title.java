class Solution {
    public String convertToTitle(int columnNumber) {
        char[] arr="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder ans=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            ans.insert(0,arr[(columnNumber%26)]);
            columnNumber/=26;
        }
        return ans.toString();
    }
}