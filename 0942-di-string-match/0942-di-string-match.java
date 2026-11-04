class Solution {
    public int[] diStringMatch(String s) {
        int e=0;
        int d = s.length();
        int a [] = new int [s.length()+1];
        for(int i=0;i<a.length-1;i++){
            if(s.charAt(i)=='D'){
            a[i]=d;
            d--;}
            else{
                a[i]=e;
                e++;}}
            a[a.length-1]=e;
            return a;

        }
    }
