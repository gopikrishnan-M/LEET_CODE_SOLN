class Solution {
    public String reverseWords(String s) {
        String[] arr=s.trim().split("\\s+");
        List<String> list=new ArrayList<>(Arrays.asList(arr));
        Collections.reverse(list);
        return String.join(" ",list);
    }
}