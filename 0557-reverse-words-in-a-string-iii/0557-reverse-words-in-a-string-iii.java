class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            arr[i]=reverser(arr[i]);
        }
        return String.join(" ",arr);
    }
    public static String reverser(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
}