class Solution {
    public String removeTrailingZeros(String num) {
        int i=num.length()-1;
        for(int j=i;j>=0;j--){
            if(num.charAt(i)=='0') i--;
            else break;}
        String t="";
        for(int k=0;k<=i;k++){
            t+=num.charAt(k);
        }
        return t;
    }
}