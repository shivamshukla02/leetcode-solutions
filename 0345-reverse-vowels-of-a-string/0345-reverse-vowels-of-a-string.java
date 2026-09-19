class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int left = 0;
        int right = c.length - 1;        
        while (left < right) {
            if (!isVowel(c[left])) {
                left++;}          
            else if (!isVowel(c[right])) {
                right--;} 
            else {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;}}
        return new String(c);}
    private boolean isVowel(char ch) {
        return ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || 
               ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || 
               ch == 'U' || ch == 'u';}}