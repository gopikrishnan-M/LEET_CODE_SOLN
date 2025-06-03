class Solution {
    public boolean isPowerOfFour(int n) {
        int[] power = {
            1,                
            4,                
            16,               
            64,               
            256,              
            1024,             
            4096,             
            16384,            
            65536,            
            262144,           
            1048576,          
            4194304,          
            16777216,         
            67108864,         
            268435456,        
            1073741824};
        int s=0,e=power.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(power[mid]==n) return true;
            else if(power[mid]<n) s=mid+1;
            else e=mid-1;
        }
        return false;
    }
}