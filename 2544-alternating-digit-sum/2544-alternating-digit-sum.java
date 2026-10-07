class Solution {
    public int alternateDigitSum(int n) {
        int temp = n;
        int c = 0;
        while (temp > 0) {
            temp = temp / 10;
            c++;}
        int a[] = new int[c];
        for (int i = 0; i < c; i++) {
            a[i] = n % 10;
            n = n / 10;}
        int sum = 0;
        int sign = 1; 
        for (int i = c - 1; i >= 0; i--) {
            sum += a[i] * sign;
            sign = -sign; }
        return sum;}}