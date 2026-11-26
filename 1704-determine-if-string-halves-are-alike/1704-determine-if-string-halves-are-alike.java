class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int a=0;
        int b=0;
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                a++;
                i++;}
            else{ i++;}
            if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u'){
                b++;
                j--;}
                else{
                    j--;
                }
        }
        return a==b;
    }
}