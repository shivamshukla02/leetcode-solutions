class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                   if(nums[i] < nums[j] && nums[k] < nums[j]){
                    int currentSum = nums[i] + nums[j] + nums[k];
                    if (currentSum < minSum) {
                        minSum = currentSum;}}}}}
   if (minSum == Integer.MAX_VALUE) {
            return -1;}
        return minSum;}}   