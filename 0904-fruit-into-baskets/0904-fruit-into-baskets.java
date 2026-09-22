class Solution {
    public int totalFruit(int[] fruits) {
       int low=0;
       int high =0;
       int result=0;
       Map<Integer,Integer> hash = new HashMap<>();
       for(high=0;high<fruits.length;high++){
        hash.put(fruits[high],hash.getOrDefault(fruits[high],0)+1);
        while(hash.size()>2){
            hash.put(fruits[low],hash.get(fruits[low])-1);
            if(hash.get(fruits[low])==0){
                hash.remove(fruits[low]);
            }
            low++;
        }
        if(hash.size()<=2){
            int len = high-low+1;
            result=Math.max(len,result);
        }
       }
       return result;
    }
}