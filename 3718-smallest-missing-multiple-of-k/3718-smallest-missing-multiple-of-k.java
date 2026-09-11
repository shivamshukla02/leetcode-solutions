import java.util.Arrays;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int expected = k;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == expected) {
                expected += k; 
            } else if (nums[i] > expected) {
                return expected; }}
        return expected;  }}
