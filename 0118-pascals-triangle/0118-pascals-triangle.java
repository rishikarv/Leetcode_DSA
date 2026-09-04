class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int n=1;n<=numRows;n++){
            List<Integer> row = new ArrayList<>();
            long ans =1;
            for(int r=1;r<=n;r++){
                row.add((int)ans);
                ans = (ans*(n-r))/r;
            }
            result.add(row);
        }
     return result;
    }
}