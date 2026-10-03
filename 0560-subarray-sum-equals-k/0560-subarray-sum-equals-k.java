class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer,Integer> hash = new HashMap<>();
        hash.put(0,1);
        int prefixSum =0;
        int count=0;
        for(int num:nums){
            prefixSum+=num;
            int req = prefixSum-k;
            if(hash.containsKey(req)){count = count+ hash.get(req);}
              hash.put(prefixSum,hash.getOrDefault(prefixSum,0)+1);
        }
            
        return count;
    }
}