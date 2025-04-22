class Solution {
    public boolean isPalindrome(String s) {
      if(s.equals("")) return true;
      s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
      StringBuilder sb=new StringBuilder(s);
      return s.equals(sb.reverse().toString());
    }
}