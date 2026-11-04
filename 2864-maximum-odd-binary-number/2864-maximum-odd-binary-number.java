class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c++;}}
                for (int i = 0; i < c - 1; i++) {
            sb.append('1');}
            for (int i = 0; i < s.length() - c; i++) {
            sb.append('0');}
                            sb.append('1');
                            return sb.toString();
        
    }
}