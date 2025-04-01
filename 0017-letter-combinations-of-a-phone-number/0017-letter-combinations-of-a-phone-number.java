class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<String>();
        return helper("",digits);
    }
    private static ArrayList<String> helper(String p, String up) {
        ArrayList<String> ans=new ArrayList<>();
        if (up.isEmpty()) {
            ans.add(p);
            return ans;
        }
        HashMap<Character,String> keypad=new HashMap<>();
        keypad= keyPadF(keypad);
        char key = up.charAt(0);
        String alfa=keypad.get(key);
        for (int i = 0; i < alfa.length() ; i++) {
            ans.addAll(helper(p+ alfa.charAt(i),up.substring(1)));
        }
        return ans;
    }
    public static HashMap<Character,String> keyPadF(HashMap<Character,String> keypad){
        keypad.put('1'," ");
        keypad.put('2',"abc");
        keypad.put('3',"def");
        keypad.put('4',"ghi");
        keypad.put('5',"jkl");
        keypad.put('6',"mno");
        keypad.put('7',"pqrs");
        keypad.put('8',"tuv");
        keypad.put('9',"wxyz");
        return keypad;
    }
}