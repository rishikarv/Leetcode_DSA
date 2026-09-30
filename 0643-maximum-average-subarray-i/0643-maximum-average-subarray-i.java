class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low=0;
        int high=k;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxsum = sum;
        for(high=k;high<nums.length;high++){
            sum -=nums[low];
            low++;
            sum+=nums[high];
            maxsum = Math.max(maxsum,sum);
        }
        return (double)maxsum/k;
    }
}