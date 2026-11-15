class Solution {
public:
    int minimumSwaps(vector<int>& nums) {
                int z = 0;

        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] == 0) {
                z++;
            }
        }

        int n = nums.size() - z;
        int swap = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                swap++;
            }
        }

        return swap;
    }
};