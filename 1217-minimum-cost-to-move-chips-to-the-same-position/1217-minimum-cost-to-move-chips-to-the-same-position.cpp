class Solution {
public:
    int minCostToMoveChips(vector<int>& position) {
        int even = 0, odd = 0;
        int i = position.size() - 1;
        while (i >= 0) {
            if (position[i] % 2 == 0) even++;
            else odd++;
            i--; }
        return min(even, odd);
    }
};