class Solution {
public:
    int maxOperations(vector<int>& nums) {
         int targetSum = nums[0] + nums[1];
        int count = 0;

        for (int i = 0; i < nums.size() - 1; i += 2) {
            if (nums[i] + nums[i + 1] == targetSum) {
                count++;
            } else {
                break; 
            }
        }

        return count;
    }
};