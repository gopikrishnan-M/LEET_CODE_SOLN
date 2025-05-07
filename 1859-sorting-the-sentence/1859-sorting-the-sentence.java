class Solution {
    public String sortSentence(String s) {
       String[] arr=s.split(" ");//split("\\s+") for multiple spaces
       String[] ans=new String[arr.length];
       for(int i=0;i<arr.length;i++){
        int correct=(arr[i].charAt(arr[i].length()-1)-'0')-1;
        ans[correct]=arr[i].substring(0,arr[i].length()-1);
       }
       return String.join(" ",ans);

    }
}