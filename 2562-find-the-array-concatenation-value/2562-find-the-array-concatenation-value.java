class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        long p = 0;

        while (low <= high) {
            if (low == high) {
                p += nums[low];
            } else {
                long c = Long.parseLong(String.valueOf(nums[low]) + String.valueOf(nums[high]));
                p += c;
            }
            low++;
            high--;
        }

        return p;
    }
}