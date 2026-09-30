class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int low =0;
        int high = k;
        int count =0;
        double sum =0;
        double avg =0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        avg = sum/k;
        if(avg>=threshold){
            count++;
        }
        for(high=k;high<arr.length;high++){
            sum-=arr[low];
            low++;
            sum+=arr[high];
            avg = sum/k;
            if(avg>=threshold){
                count++;
            }
        }
        return count;
    }
}