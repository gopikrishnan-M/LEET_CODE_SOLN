class Solution {
    public boolean areNumbersAscending(String s) {
        int temp=-1;
        for (String word : s.split(" ")) {
            if (Character.isDigit(word.charAt(0))) {
                int num = Integer.parseInt(word);
                if (num <= temp) {
                    return false;
                }
                temp = num;
            }
        }
        return true;
    }
}