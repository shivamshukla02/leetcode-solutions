class Solution {
public:
    int minElement(vector<int>& nums) {
         for(int i=0;i<nums.size();i++){
            int d=0;
            while(nums[i]>0){
                int digit = nums[i]%10;
                d=d+digit;
                nums[i]=nums[i]/10;}
                nums[i]=d;}
                int min = nums[0];
                for(int i=0;i<nums.size();i++){
                    if(min>nums[i]){
                        min=nums[i];}}
                        return min;
    }
};