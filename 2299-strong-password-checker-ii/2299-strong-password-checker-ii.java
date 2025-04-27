class Solution {
    public boolean strongPasswordCheckerII(String p) {
        if (p.length() < 8 ||
            !p.matches(".*[a-z].*") ||
            !p.matches(".*[A-Z].*") ||
            !p.matches(".*[0-9].*") ||
            !p.matches(".*[!@#$%^&*()\\-+].*") ||
            p.matches(".*(.)\\1.*"))
            return false;
        
        return true;
    }
}
