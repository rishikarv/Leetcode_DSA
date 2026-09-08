class Solution {
    public boolean validMountainArray(int[] arr) {
        int i=1;
        if(arr.length<3){
            return false;
        }
        int left =0;
        while(left<arr.length-1){
            if(arr[left]<arr[left+1]){
                left++;
            }
            else{
                break;
            }
        }
        int right = arr.length-1;
        while(right>0){
            if(arr[right]<arr[right-1]){
                right--;
            }
            else{
                break;
            }
        }
        if(left>0&&right<arr.length-1&&left==right){
            return true;
        }
        return false;
    }
}