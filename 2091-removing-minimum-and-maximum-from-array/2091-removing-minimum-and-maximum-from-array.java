class Solution {
    public int minimumDeletions(int[] nums) {
        int maxIdx =0;
        int minIdx =0;
        int n = nums.length;
        if(n<=2){
            return n;
        }
        for(int i=1;i<n;i++){
            if(nums[i]<nums[minIdx]){
                minIdx=i;
            }
            if(nums[i]>nums[maxIdx]){
                maxIdx=i;
            }
        }
        int i=Math.min(minIdx,maxIdx);
        int j=Math.max(minIdx,maxIdx);
        int choice1 =j+1;
        int choice2 = n-i;
        int choice3 = (i+1)+(n-j);

        return Math.min(choice1,(Math.min(choice2,choice3)));

    }
}