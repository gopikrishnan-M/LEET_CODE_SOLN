class Solution {
    public String reverseOnlyLetters(String s) {
     char[] arr = s.toCharArray();
     int l=0;
     int r=arr.length-1;
     while(l<r){
        while(l<r&&Character.isAlphabetic(arr[l])!=true){
            l++;
        }
        while(l<r&&Character.isAlphabetic(arr[r])!=true){
            r--;
        }
        char temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        l++;
        r--;

     }
   
     
     return new String(arr);   
    }
}