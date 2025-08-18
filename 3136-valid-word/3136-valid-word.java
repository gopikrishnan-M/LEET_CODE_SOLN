class Solution {
    public boolean isValid(String word) {
        if(word.length() <3) return false;
        String vow="aeiouAEIOU";
        boolean v=false,co=false;
        for(char c:word.toCharArray()){
            if(!Character.isLetterOrDigit(c)) return false;
            if(Character.isLetter(c)){
                if(vow.indexOf(c)<0) v=true;
                else co=true;
            }
        }
        return co&v;
    }
}