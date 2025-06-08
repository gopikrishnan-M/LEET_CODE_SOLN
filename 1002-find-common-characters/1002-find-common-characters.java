class Solution {
    public List<String> commonChars(String[] words) {
        int[] mfreq=new int[26];
        Arrays.fill(mfreq,Integer.MAX_VALUE);
        List<String> ans=new ArrayList<>();
        for(String word:words){
            int[] freq=new int[26];
            for(char c:word.toCharArray()) freq[c-'a']++;
            for(int i=0;i<26;i++) mfreq[i]=Math.min(mfreq[i],freq[i]);
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<mfreq[i];j++) ans.add(String.valueOf((char)(i+'a')));
        }
        return ans;
    }
}