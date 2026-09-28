class Solution {
        private boolean check(Map<Character,Integer>hashs,Map<Character,Integer>hasht){
        for(Character key : hasht.keySet()){
            if(hashs.getOrDefault(key,0)<hasht.get(key)){
                return false;
            }
    }
     return true;
    }

    public String minWindow(String s, String t) {
        if(s.length()<t.length())return "";
        int low=0;
        int high=0;
        int res =Integer.MAX_VALUE;
        Map<Character , Integer> hasht = new HashMap<>();
        Map<Character , Integer> hashs = new HashMap<>();
        for(int i=0;i<t.length();i++){
            hasht.put(t.charAt(i),hasht.getOrDefault(t.charAt(i),0)+1);
        }

        int start=0;
        for(high=0;high<s.length();high++){
            hashs.put(s.charAt(high),hashs.getOrDefault(s.charAt(high),0)+1);
            while(check(hashs,hasht)){
                int len=high-low+1;
                if(res>len){
                res= len;
                start = low;
                }
                hashs.put(s.charAt(low),hashs.get(s.charAt(low))-1);
                low++;
            }
        }
        if(res==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,res+start);
    }
}