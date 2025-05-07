class Solution {
    public String interpret(String command) {
        command=command.replace("()","o");
        if(command.contains("(")&&command.contains(")")){
            command=command.replace("(","");
            command=command.replace(")","");
        }
        return command;
        
    }
}