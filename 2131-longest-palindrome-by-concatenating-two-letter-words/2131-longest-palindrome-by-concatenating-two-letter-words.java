class Solution {
    public int longestPalindrome(String[] words) {
        int[][] counter=new int[26][26];
        int len=0;
        boolean mid=false;
        
        for(String s:words){
            int a=s.charAt(0)-'a';
            int b=s.charAt(1)-'a';
            if(counter[b][a]>0){
                len+=4;
                counter[b][a]--;
            }
            else counter[a][b]++;
        }
        for(int i=0;i<26;i++){
            if(counter[i][i]>0){
                len+=2;
                break;
            }
        }
        return len;
        
    }
}