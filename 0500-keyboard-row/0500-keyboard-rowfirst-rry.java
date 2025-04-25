class Solution {
    public String[] findWords(String[] words) {
        List<String> ans=new ArrayList<>();
        for(String s:words){
            if(isSameRow(s)) ans.add(s);
        }
        String[] answer=new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            answer[i]=ans.get(i);
        }
        return answer;

    }
    public boolean isSameRow(String s){
        String r1="qwertyuiopQWERTYUIOP",r2="asdfghjklASDFGHJKL",r3="zxcvbnmZXCVBNM";
        boolean row1=true,row2=true,row3=true;
        for(int i=0;i<s.length();i++){
            if(r1.indexOf(s.charAt(i))==-1){
                row1=false;
            }
            if(r2.indexOf(s.charAt(i))==-1){
                row2=false;
            }
            if(r3.indexOf(s.charAt(i))==-1){
                row3=false;
            }
            // if(!row1&&!row2&&!row3) break;
        }
        return row1||row2||row3;
        
    }
}