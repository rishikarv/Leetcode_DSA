class Solution {
    public long countCommas(long n) {
        if(n<1000){
            return 0;
        }
        long total =0;
        long thresh =1000;
        while(thresh<=n){
            total += n-thresh+1;
            thresh*=1000;
        }
        return total;
    }
}