class Solution {
    public int longestOnes(int[] nums, int k) {
        int low =0;
        int high =0;
        int res =0;
        int [] arr=new int[2];
        for(high=0;high<nums.length;high++){
            arr[nums[high]]++;
            int len = high-low+1;
            int diff = len - arr[1];
            while(diff>k){
                arr[nums[low]]--;
                low++;
                len = high-low+1;
                diff=len-arr[1];
            }
            len = high-low+1;
            res = Math.max(res,len);
        }
        return res;
    }
}