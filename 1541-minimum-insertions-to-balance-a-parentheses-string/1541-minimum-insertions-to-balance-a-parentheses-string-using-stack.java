class Solution {
    public int minInsertions(String s) {
        int i=0,insert=0;
        Stack<Character> stack=new Stack<>();
        while(i<s.length()){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
                i++;
            }
            else{
                if(i+1<s.length()&&s.charAt(i+1)==')'){
                    if(!stack.empty()) stack.pop();
                    else{
                        insert++;
                    }
                    i=i+2;
                }
                else{
                    if(!stack.empty()){
                        stack.pop();
                        insert++;
                    }
                    else{
                        insert=insert+2;
                    }
                    i++;
                }

            }
        }
        insert=insert+stack.size()*2;
        return insert;
    }
}