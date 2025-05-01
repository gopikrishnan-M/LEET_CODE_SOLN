class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk=new Stack<>();
        int max=0;


        for(int i=0;i<heights.length;i++){
            while(!stk.empty()&&heights[i]<heights[stk.peek()]){
                max=getMax(heights,stk,max,i);
            }
            stk.push(i);
        }
        int i=heights.length;
        while(!stk.empty()){
            max=getMax(heights,stk,max,i);
        }


        return max;
    }

    private int getMax(int[]heights,Stack<Integer> stk,int max,int i){
        int area;
        int popped=stk.pop();
        if(stk.isEmpty()){
            area=heights[popped]*i;
        }
        else{
            area=heights[popped]*(i-1-stk.peek());
        }

        return Math.max(max,area);
    }
}