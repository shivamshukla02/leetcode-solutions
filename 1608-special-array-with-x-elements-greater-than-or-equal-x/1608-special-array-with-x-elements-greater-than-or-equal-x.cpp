class Solution {
public:
    int specialArray(vector<int>& nums) {
        for(int x=0;x<=nums.size();x++){
        int c=0;
        for(int j=0;j<nums.size();j++){
        if(nums[j]>=x){
            c++;}}
            if(x==c){
                return x;} }
     return -1;   
    }
};