class Solution {
public:
    int countDigitOccurrences(vector<int>& nums, int digit) {
         int c=0;
        for(int i=0;i<nums.size();i++){
            while(nums[i]>0){
            int d=nums[i]%10;
            if(d==digit){
                c++;}
                nums[i]=nums[i]/10;}}
                return c;
    }
};