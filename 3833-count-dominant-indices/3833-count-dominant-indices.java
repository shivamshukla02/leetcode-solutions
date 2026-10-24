class Solution {
    public int dominantIndices(int[] nums) {
        int c = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int sum = 0;
            int k = 0;

            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                k++;
            }

            if ((double) nums[i] > (double) sum / k) {
                c++;
            }
        }

        return c;
    }
}