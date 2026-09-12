class Solution {
    public int totalWaviness(int num1, int num2) {
        int totalSum = 0;
        for (int i = num1; i <= num2; i++) {
            int[] digits = new int[10];
            int len = 0;
            int temp = i;
            while (temp > 0) {
                digits[len++] = temp % 10;
                temp /= 10;}
            for (int j = 0; j < len / 2; j++) {
                int t = digits[j];
                digits[j] = digits[len - 1 - j];
                digits[len - 1 - j] = t;}
            if (len < 3) 
            continue;
            for (int j = 1; j < len - 1; j++) {
                if (digits[j] > digits[j - 1] && digits[j] > digits[j + 1]) { totalSum++;} 
                else if (digits[j] < digits[j - 1] && digits[j] < digits[j + 1]) {
                    totalSum++;}}}
        return totalSum;
    }
}