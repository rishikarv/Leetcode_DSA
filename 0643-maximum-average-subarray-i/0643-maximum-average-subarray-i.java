class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low=0;
        int high=k;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxavg = sum/k;
        for(high=k;high<nums.length;high++){
            sum -=nums[low];
            low++;
            sum+=nums[high];
            maxavg = Math.max(maxavg,sum/k);
        }
        return maxavg;
    }
}