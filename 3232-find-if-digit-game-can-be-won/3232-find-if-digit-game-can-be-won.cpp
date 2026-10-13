class Solution {
public:
    bool canAliceWin(vector<int>& nums) {
             int sum1=0;
     int sum2=0;
     for(int i=0;i<nums.size();i++){
        int temp = nums[i];
        int rev=0;
        int c =0;
        while(temp>0){
            temp=temp/10;
            c++;}
            if(c==1){
                sum1+=nums[i];}
                else{
                    sum2+=nums[i];}}
                 if(sum1!=sum2){
                    return true;
                 }  
                 return false;  
    }
};