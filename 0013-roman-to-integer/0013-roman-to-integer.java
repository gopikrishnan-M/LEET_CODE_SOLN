class Solution {
    public int romanToInt(String s) {
        int res=0;
        Map<Character,Integer> link=new HashMap<>();
        link.put('I',1);
        link.put('V',5);
        link.put('X',10);
        link.put('L',50);
        link.put('C',100);
        link.put('D',500);
        link.put('M',1000);
        int curr=0;
        int prev=0;
        for(int i=s.length()-1;i>=0;i--){
            curr=link.get(s.charAt(i));
            if(curr<prev){
                res-=curr;
            }
            else{
                res+=curr;
            }
            prev=curr;
        }

        return res;
        
    }
}