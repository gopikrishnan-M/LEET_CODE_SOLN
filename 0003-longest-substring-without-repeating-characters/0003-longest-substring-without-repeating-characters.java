class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int l=s.length();
        int front=0;
        Set<Character> sub=new HashSet<>();
        for(int i=0;i<l;i++){
            while(sub.contains(s.charAt(i))){
                sub.remove(s.charAt(front));
                front++;
            }
            sub.add(s.charAt(i));
            max=Math.max(max,i-front+1);
        }
        return max;
    }
}