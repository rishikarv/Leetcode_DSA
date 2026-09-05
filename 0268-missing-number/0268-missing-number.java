class Solution {
    public int missingNumber(int[] nums) {
        int n =nums.length;
        int actualsum =0;
        int expectedsum =0;
        for(int i=0;i<=n;i++){
            expectedsum +=i;
        }
        for(int i=0;i<n;i++){
            actualsum +=nums[i];
        }
        return  expectedsum-actualsum;
    }
}