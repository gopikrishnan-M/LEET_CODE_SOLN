class Solution {
    public String reversePrefix(String word, char ch) {
        int rInd=word.indexOf(ch);
        if(rInd==-1) return word;
        StringBuilder ans=new StringBuilder(word.substring(0,rInd+1));
        ans.reverse();
        if(rInd+1<word.length())
        ans.append(word.substring(rInd+1));
        return ans.toString();
    }
}