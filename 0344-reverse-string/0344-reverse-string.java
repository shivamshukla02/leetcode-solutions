class Solution {
    public void reverseString(char[] s) {
        int start = 0;
    int end = s.length - 1;   
    while (start < end) {
           char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
          start++;
        end--;}
}}

 /*for(int i=0;i<s.length/2;i++){
            int front = i;
            int back = s.length-1-i;
            char temp = s[front];
            s[front]=s[back];
            s[back] = temp;}*/ 