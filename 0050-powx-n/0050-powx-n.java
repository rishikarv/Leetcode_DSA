class Solution {
    public double myPow(double x, int n) {
        if(n==0)return 1;
        if(x==0)return 0;
        if(x==1)return 1;
        if(x==-1&&n%2==0)return 1;
        if(x==-1&&n%2!=0)return -1;

        long pow = n;
        double ans =1;

        if(n<0){
            x=1/x;
            pow = -pow;
        }
        while(pow>0){
            if(pow%2==1){
                ans = ans*x;
            }
           
            x=x*x;
            pow /=2;
        }
        return ans;
    }
}