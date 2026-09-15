class Solution {
    public int myAtoi(String s) {
        if(s==null)return 0;
        String str = s.trim();
        if(str.length()==0)return 0;
        int sign =1;
        int i=0;
        if(str.charAt(i)=='-'){
            sign=-1;
            i=i+1;
        }
        else if(str.charAt(i)=='+'){
            i=i+1;
        }
        int result =0;
        while(i<str.length() && str.charAt(i)>='0'&&str.charAt(i)<='9'){
            int digit = str.charAt(i)-'0';
            if(result==Integer.MAX_VALUE/10){
                if(sign==1&&digit>=7){
                  return Integer.MAX_VALUE;
                }
                else if(sign==-1&&digit>=8){
                    return Integer.MIN_VALUE;
                }
            }
            if(result>Integer.MAX_VALUE/10){
                if(sign==1)return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;      
            }
            
            result = result*10+digit;
            i++; 
        }
        return sign*result;
    }
}