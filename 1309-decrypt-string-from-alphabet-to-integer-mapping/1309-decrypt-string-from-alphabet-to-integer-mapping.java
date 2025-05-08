class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans=new StringBuilder();
        int n=s.length();
        char[] arr=s.toCharArray();
        int i=0;
        while(i<n){
            if(!s.contains("#")){
                ans.append((char)((arr[i]-'0') + 96));
                i++;
            }
            else if(i>n-3){
                ans.append((char)((arr[i]-'0') + 96));
                i++;
            }
            else if(i<n-3&&arr[i+2]!='#'){
                ans.append((char)((arr[i]-'0') + 96));
                i++;
            }
            else{
                int tens=arr[i]-'0';
                int once=arr[i+1]-'0';
                tens=tens*10+once+96;
                ans.append((char)tens);
                i=i+3;
            }
            
        }
        return ans.toString();

    }
}