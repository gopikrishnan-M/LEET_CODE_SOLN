class Solution {
    public boolean isAnagram(String s, String t) {
        // for(char c:s.toCharArray()){
        //     if(t.indexOf(c)<0) return false;
        // }
        //above one fails for duplicate +ce in s and -ce in t
        if(s.length() != t.length()) return false;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            //this will blow you 
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int n:freq) if(n!=0) return false;
        return true;
    }
}