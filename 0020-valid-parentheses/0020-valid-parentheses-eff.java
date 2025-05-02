class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='['||c=='{'||c=='('){
                stk.push(c);
            }
            else{
                if(stk.empty()) return false;
                char popd=stk.pop();
                if(c==']'&&popd!='[') return false;
                if(c=='}'&&popd!='{') return false;
                if(c==')'&&popd!='(') return false;
            }
        }
        return stk.empty();
    }
}