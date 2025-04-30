class Solution {
        public static int lengthOfLastWord(String s) {
        int last = s.length() - 1;
        while (last >= 0 && s.charAt(last) == ' ') {
            last--;
        }
        int length = 0;
        while (last >= 0 && s.charAt(last) != ' ') {
            length++;
            last--;
        }
        return length;
    }
}
