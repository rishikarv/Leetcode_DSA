class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int high =0;
        int sum=0;
        int res=Integer.MAX_VALUE;
        for(high=0;high<nums.length;high++){
            sum+=nums[high];
            while(sum>=target){
                int len=high-low+1;
                sum-=nums[low];
                low++;
                res=Math.min(res,len);
            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}