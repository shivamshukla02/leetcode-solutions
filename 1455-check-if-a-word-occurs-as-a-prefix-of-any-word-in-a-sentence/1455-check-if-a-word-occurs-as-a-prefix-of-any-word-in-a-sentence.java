class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int c = 1;
        int n = 0;
        int s = searchWord.length();
        int j = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                c++;
                n = 0;
                j = 0; }
            else if (j != -1 && sentence.charAt(i) == searchWord.charAt(j)) {
                n++;
                j++;
                if (n == s) {
                    return c;}}
            else {
                j = -1;}}
        return -1;
    }
}