class Solution {
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }
        int totalComma =0;
        int t=1000;
        while(n>=t){
           totalComma += (n-1000+1);
           t*=1000;
        }
        return totalComma;
    }
}