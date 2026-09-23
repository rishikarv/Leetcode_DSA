class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int high =0;
        int res = 0;
        Map<Character,Integer> hash = new HashMap<>();
        for(high=0;high<s.length();high++){
            hash.put(s.charAt(high),hash.getOrDefault(s.charAt(high),0)+1);
            int k = high-low+1;
            while(hash.size()<k){
                hash.put(s.charAt(low),hash.get(s.charAt(low))-1);
                if(hash.get(s.charAt(low))==0){
                    hash.remove(s.charAt(low));
                }
                low++;
                k=high-low+1;
            }
            int len = high-low+1;
            res=Math.max(res,len);
        }
        return res;
    }
}