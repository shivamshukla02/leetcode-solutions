class Solution {
    public String reversePrefix(String word, char ch) {
        int k = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                k = i;
                break;}}
        String q = word.substring(k + 1);
        if (k != 0 || word.charAt(0) == ch) {
            String p = word.substring(0, k + 1);
            char[] pArr = p.toCharArray(); 
            for (int i = 0; i < pArr.length / 2; i++) {
                int front = i;
                int back = pArr.length - 1 - i;
                char temp = pArr[front];
                pArr[front] = pArr[back];
                pArr[back] = temp;}
            return new String(pArr) + q;}
        return word;}}