class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<String>();
        return helper("",digits);
    }
    public List<String> helper(String p,String up){
        List<String> ans=new ArrayList<>();
        if (up.isEmpty()) {
            ans.add(p);
            return ans;
        }
        int s=0;
        int e=0;
        int digit=up.charAt(0)-'0';
        if(digit<7) {
            s=(digit-2)*3;
            e=s+3;
            for (int i= s; i < e ; i++){
            char c= (char) ('a'+i);
            ans.addAll(helper(p+c,up.substring(1)));
            }
        }
        else{
            if(digit==7){
                s=15;
                e=18;
            }
            else if(digit==8){
                s=19;
                e=21;
            }
            else{
                s=22;
                e=25;
            }
            for(int i=s;i<e;i++){
                char c= (char) ('a'+ i);
                ans.addAll(helper(p+c,up.substring(1)));
            }
        }
        return ans;
    }
}