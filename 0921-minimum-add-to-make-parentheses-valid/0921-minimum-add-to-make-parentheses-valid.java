class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(char c:s.toCharArray()){
            if(c==')'&&!stk.empty()&&stk.peek()=='(') stk.pop();
            else{
                stk.push(c);
            }
        }
        return stk.size();
    }
}