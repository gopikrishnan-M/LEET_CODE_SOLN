class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        List<Character> noD=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!noD.contains(s.charAt(i))){
                noD.add(s.charAt(i));
            }
            else {
                int indx=noD.indexOf(s.charAt(i));
                max=Math.max(max,noD.size());
                noD=new ArrayList<>(noD.subList(indx+1,noD.size()));
                noD.add(s.charAt(i));
            }
        }
        return max=Math.max(max,noD.size());
    }
}