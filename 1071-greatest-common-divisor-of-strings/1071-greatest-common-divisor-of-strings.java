class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String s = "";
        int m = str1.length();
        int n = str2.length();
        int i,gcd=1;
        for(i=1;i<=m&&i<=n;i++){
            if(m%i==0&&n%i==0){
                gcd=i;}}
                if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
               return str1.substring(0,gcd);}}