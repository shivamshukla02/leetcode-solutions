class Solution {
    public boolean isPowerOfFour(int n) {
   if (n <= 0) {
            return false;
        }

        for (int x = 0; x <= 30; x++) {
            if (n == Math.pow(4, x)) {
                return true;
            }
        }

        return false;
    }
}