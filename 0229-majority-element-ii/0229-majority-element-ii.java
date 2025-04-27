class Solution {
    public List<Integer> majorityElement(int[] arr) {
        Arrays.sort(arr);
        int count=0;
        int val=arr[0];
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(val==arr[i] ) {
                count++;
            }
            else{
                if(count>arr.length/3) ans.add(val);
                val=arr[i];
                count=1;
            }
        }
        if(count>arr.length/3) ans.add(val);


        return ans;
    }

}