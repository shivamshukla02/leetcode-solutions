class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
           int c=0;
        int s=0;
        for(int i=0;i<nums.size();i++){
            c=c+nums[i];}
            if(c%k==0){
                return 0;}
                return c%k;
    }
};