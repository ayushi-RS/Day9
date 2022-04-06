class Solution {
    public boolean canJump(int[] nums) {
        
        int from_here=nums.length-1;
        
        for(int i=nums.length-2;i>=0;i--) {
            if(i+nums[i] >= from_here) {
                from_here = i;
            }
          
            
        }
        if(from_here == 0) return true;
        return false;
    }
    
  
   
}