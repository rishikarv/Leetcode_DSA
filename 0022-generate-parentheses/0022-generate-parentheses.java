class Solution {
    static boolean isValid(String curr){
        int count =0;
        for(char c : curr.toCharArray()){
            if(c=='(')count++;
            else if(c==')')count--;
            if(count<0){
                return false;
            }
        }
        return count==0;
    }
    static void solve(String curr,int n,List<String> result){
        
        if(curr.length()==2*n){
            if(isValid(curr)){
                result.add(curr);
            }
            return;
        }
        solve(curr+"(",n,result);
        solve(curr+")",n,result);
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        solve("",n,result);
        return result;
    }
}