class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int i=word1.length(),j=word2.length(),c=0;

        while(c<i&&c<j){
            sb.append(word1.charAt(c));
            sb.append(word2.charAt(c));
            c++;
        }
        if(c<i){
            sb.append(word1.substring(c));
        }
        else if(c<j){
            sb.append(word2.substring(c));
        }
        return sb.toString();
    }
}