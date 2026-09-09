class Solution {
    public boolean isMonotonic(int[] nums) {
        int i=0;
        int j= nums.length -1;
        if(nums[i]<=nums[j]){
            while(i<j){
                if(nums[i]<=nums[i+1]){
                    i++;
                }
                else{
                    return false;
                }
            }
            return true;
            }

         else if(nums[i]>=nums[j]){
            while(i<j){
                if(nums[i]>=nums[i+1]){
                    i++;
                }
                else{
                    return false;
                }
            }
            return true;
            }
            return false;
        }
       
    }
