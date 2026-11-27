class Solution {
    public String trimTrailingVowels(String s) {
        int k=-1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                k=i;
            }
            else break;
        }
        if(k==-1) return s;
        String t="";
        for(int j=0;j<k;j++){
            t+=s.charAt(j);
        }
        return t;
    }
}