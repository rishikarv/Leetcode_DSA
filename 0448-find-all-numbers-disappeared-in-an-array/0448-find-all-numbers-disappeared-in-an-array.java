class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     int n= nums.length;
     Set<Integer> hash = new HashSet<>();
     for(int i=0;i<n;i++){
        hash.add(nums[i]);
     }
     List <Integer> list = new ArrayList<>();
     for(int i=1;i<=n;i++){
        if(!hash.contains(i)){
            list.add(i);
        }
     }  
     return list; 
    }
}