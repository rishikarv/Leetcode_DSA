class Solution {
    public int max(int[]a){
        int max=0;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
    public int timebound(int[]arr , int k){
        int time=0;
        for(int i=0;i<arr.length;i++){
         time +=Math.ceil((double)arr[i]/k);
        }
        return time;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high = max(piles);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(timebound(piles,mid)<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}