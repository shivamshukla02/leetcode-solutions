class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int k=0;
        for(int i=0;i<nums.size();i++){
            int c=0;
            int temp = nums[i];
            while(temp>0){
                temp=temp/10;
                c++;}
                if(c%2==0){
                    k++;}}
                    return k;
    }
};