class Solution {
    public int ladderLength(String begin, String end, List<String> WordList) {
        Set<String> List=new HashSet<>(WordList);//we are making this set for faster lookup or traversal whatever....
        //else this will throw time limit exeeded even tis takes longer time
        if(!List.contains(end)) return 0;
        Set<String> visited=new HashSet<>();
        Queue<String> q=new LinkedList<>();
        q.offer(begin);
        visited.add(begin);
        int l=0;
        while(!q.isEmpty()){
            int size=q.size();
            l++;
            for(int i=0;i<size;i++){
                String current=q.poll();
                for(int j=0;j<current.length();j++){
                    char[] temp=current.toCharArray();
                    for(char ch='a';ch<='z';ch++){
                        temp[j]=ch;
                        String nword=new String(temp);
                        if(nword.equals(end)){
                            return l+1;
                        }
                        if(List.contains(nword) && !visited.contains(nword)){
                            q.offer(nword);
                            visited.add(nword);
                        }
                    }
                }
            }
        }
        return 0;
    }
}