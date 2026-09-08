class Solution {
    public int thirdMax(int[] nums) {
        Set <Integer> maxSet = new HashSet <>();
        for(int num:nums){
            maxSet.add(num);
            if(maxSet.size()>3){
               maxSet.remove(Collections.min(maxSet));
            }
        }
        if(maxSet.size()==3){
            return Collections.min(maxSet);
        }
        return Collections.max(maxSet);
    }
}