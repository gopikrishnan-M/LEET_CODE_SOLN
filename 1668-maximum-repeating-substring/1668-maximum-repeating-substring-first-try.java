class Solution {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        String k=word;
        while(sequence.contains(k)){
            count++;
            k+=word;
        }
        return count;
    }
}