import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Solution {
    public List<Integer> findPeaks(int[] mountain){
       List<Integer> result= new ArrayList<>();
       int l=(mountain.length)-2;
      
       

        for(int i=0;i<l;i++){
        if(mountain[i]<mountain[i+1]&& mountain [i+1]>mountain [i+2]){
            result.add(i+1);
        }
       }
       return(result);
    }
}