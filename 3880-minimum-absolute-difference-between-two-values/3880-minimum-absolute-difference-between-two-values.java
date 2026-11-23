class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] == 1 && nums[j] == 2) || (nums[i] == 2 && nums[j] == 1)) {
                    int diff = Math.abs(i - j);
                    if (diff < min) {
                        min = diff;}}}}
        return min == Integer.MAX_VALUE ? -1 : min;}}