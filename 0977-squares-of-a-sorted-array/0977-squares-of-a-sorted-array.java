class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int left=0;
        int right = nums.length-1;
        int index=nums.length-1;
        while(left<=right){
            int sqleft = nums[left]*nums[left];
            int sqright = nums[right]*nums[right];

            if(sqleft>sqright){
                ans[index]=sqleft;
                left++;
            }
            else{
                ans[index]=sqright;
                right--;
            }
            index--;
        }
        return ans;
    }
}