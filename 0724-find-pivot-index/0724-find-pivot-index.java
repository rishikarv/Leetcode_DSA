class Solution {
    public int pivotIndex(int[] nums) {
    int rsum=0;
    int lsum=0;
    int total =0;
     for(int n:nums){
        total+=n;
     }
     for(int i=0;i<nums.length;i++){
        rsum=total-lsum-nums[i];
        if(rsum==lsum){
            return i;
        }
        else{
            lsum+=nums[i];
        }
     }
     return -1;
   
}}