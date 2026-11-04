class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = letters[0];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<letters.length;i++){
            int d = letters[i]-target;
            if(d<min && d>0){
                min = d;
                ans = letters[i];}}
                if(min==Integer.MAX_VALUE){
                    return letters[0];}
                    return ans;}}