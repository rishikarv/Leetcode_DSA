class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        String [] arr =  new String [numRows];
        for(int i=0;i<arr.length;i++){
            arr[i]="";
        }
        int idx =0;
        while(idx<s.length()){
            for(int i=0;i<numRows&&idx<s.length();i++){
                arr[i]+=s.charAt(idx);
                idx++;
            }
            for(int i=numRows-2;i>0&&idx<s.length();i--){
                arr[i]+=s.charAt(idx);
                idx++;
            }
        }
        String res = "";
        for(String str:arr){
            res+=str;
        }
        return res;
    }
}