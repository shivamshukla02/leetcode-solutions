class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        
        int sum = 0;
        while (k-- > 0) {
            sum += max;
            max++;
        }
        
        return sum;
    }
}