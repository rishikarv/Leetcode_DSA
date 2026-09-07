class Solution {
    static int[] reverse(int[]nums,int left,int right){
        
        while(left<right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        return nums;
    }
    public void rotate(int[] nums, int k) {
    
        int n = nums.length;
         if(k<0){
            k+=n;
        }
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
}
