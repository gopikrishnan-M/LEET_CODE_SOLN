class Solution {
    public boolean checkIfPangram(String sentence) {
        ArrayList<Character> alfabet=new ArrayList<>();
        int l=sentence.length();
        if(l<26) return false;
        for(char c='a' ;c<='z' ;c++){
            alfabet.add(c);
        }
        for (int i=0; i< sentence.length(); i++){
            alfabet.remove(Character.valueOf(sentence.charAt(i)));
        }
        return alfabet.isEmpty();
        }
}