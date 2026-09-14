class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder [] rows =  new StringBuilder [numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }
        int curRow =0;
        int direction =1;

        for(char c : s.toCharArray()){
            rows[curRow].append(c);
            if(curRow==0){
                direction =1;
            }
            else if(curRow==numRows-1){
                direction =-1;
            }
            curRow +=direction;
        }
        String result ="";
        for(StringBuilder str:rows){
            result+=str;
        }
        return result;
    }
}