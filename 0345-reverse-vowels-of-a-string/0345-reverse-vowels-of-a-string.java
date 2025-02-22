class Solution {
    public String reverseVowels(String s) {
    String vowel="AEIOUaeiou";
    char []arr=s.toCharArray();
    int l=0;
    int r=arr.length-1;
    while(l<r){
        while(l<r&&vowel.indexOf(arr[l]) == -1){
            l++;
        }
        while(l<r&&vowel.indexOf(arr[r]) == -1){
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