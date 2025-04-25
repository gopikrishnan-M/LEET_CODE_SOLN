class Solution {
    public void merge(int[] res, int m, int[] r, int n) {
        int[] l=new int[m];
        for(int i=0;i<m;i++){
            l[i]=res[i];
        }
        int i=0;
        int j=0;
        int k=0;
        while(i<m&&j<n){
            if(l[i]<r[j]) res[k++]=l[i++];
            else res[k++]=r[j++];
        }
        while(i<m) res[k++]=l[i++];
        while(j<n) res[k++]=r[j++];
    }
}