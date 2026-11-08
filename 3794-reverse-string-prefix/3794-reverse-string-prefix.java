class Solution {
    public String reversePrefix(String s, int k) {
       StringBuilder sb = new StringBuilder();
       int n = k-1;
       if(n==0) return s;
       for(int i=k-1;i>=0;i--){
        sb.append(s.charAt(i));}
        for(int i=k;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();}}