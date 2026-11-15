class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int c = 0;
        int ans = 0;

        for (int i = 0; i < nums.size(); i++) {
            c++;

            if (c <= 2) {
                nums[ans] = nums[i];
                ans++;
            }

            if (i == nums.size() - 1 || nums[i] != nums[i + 1]) {
                c = 0;
            }
        }

        return ans;
    }
};