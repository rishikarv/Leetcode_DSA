class Solution {
    static int maxfreq(int []arr){
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public int characterReplacement(String s, int k) {
     int low=0;
     int high =0;
     int maxlen =0;
     int maxcnt =0;
     int[] hash = new int[26];
     for(high =0;high<s.length();high++){
        hash[s.charAt(high)-'A']++;
        int len = high-low+1;
        maxcnt = maxfreq(hash);
        int diff = len-maxcnt;
        while(diff>k){
            hash[s.charAt(low)-'A']--;
            low++;
            maxcnt = maxfreq(hash);
            len = high-low+1;
            diff = len-maxcnt;
        }
        len = high-low+1;
        maxlen=Math.max(len,maxlen);
     }
     return maxlen;
    }
}