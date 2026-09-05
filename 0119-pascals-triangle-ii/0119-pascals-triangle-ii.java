class Solution {
    public List<Integer> getRow(int rowIndex) {
        List <Integer> row = new ArrayList<>();
        long ans =1 ;
        row.add((int)ans);
        for(int r=1;r<=rowIndex;r++){
            ans = (ans*(rowIndex+1-r))/r;
            row.add((int)ans);
        }
        return row;
    }
}