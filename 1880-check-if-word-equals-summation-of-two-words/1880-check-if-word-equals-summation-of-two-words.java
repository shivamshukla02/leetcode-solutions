class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;

        for (int i = 0; i < firstWord.length(); i++) {
            int value1 = firstWord.charAt(i) - 'a';
            s1 = s1 * 10 + value1;
        }

        for (int i = 0; i < secondWord.length(); i++) {
            int value2 = secondWord.charAt(i) - 'a';
            s2 = s2 * 10 + value2;
        }

        for (int i = 0; i < targetWord.length(); i++) {
            int value3 = targetWord.charAt(i) - 'a';
            s3 = s3 * 10 + value3;
        }

        return s1 + s2 == s3;
    }
}