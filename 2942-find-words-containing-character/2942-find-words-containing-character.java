class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int index = words[i].indexOf(x);
            if (index != -1)
                ans.add(i);
        }
        return ans;
    }
}