class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!stk.empty()){
                if(c==')'&&stk.peek()=='(') stk.pop();
                else if(c=='}'&&stk.peek()=='{') stk.pop();
                else if(c==']'&&stk.peek()=='[') stk.pop();
                else{
                    stk.push(c);
                }
            }
            else{
                stk.push(c);
            }
        }
        return stk.empty();
    }
}