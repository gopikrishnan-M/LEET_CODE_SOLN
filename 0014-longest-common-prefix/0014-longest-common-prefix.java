class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder(strs[strs.length -1]);
        int min=strs[0].length();
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()==0){
                return new String("");
            }
             min=Math.min(sb.length(),strs[i].length());
             for(int j=0;j<min;j++){
                sb.delete(min,sb.length());
               if(sb.charAt(j)!=strs[i].charAt(j)){
                sb.delete(j,sb.length());
                break;}
            }
        }
        return new String(sb);
        
    }
}