class Solution {
    public boolean halvesAreAlike(String s) {
        int a=0,b=0,n=s.length();
        for(int i=0;i<n/2;i++){
            if(isVowel(s.charAt(i))!=-1){
                a++;
            }
        }
        for(int i=n/2;i<n;i++){
            if(isVowel(s.charAt(i))!=-1){
                b++;
            }
        
        }
        return a==b;
    }
    public int isVowel(char c){
        String vow="AEIOUaeiou";
        return vow.indexOf(c);
    }
}