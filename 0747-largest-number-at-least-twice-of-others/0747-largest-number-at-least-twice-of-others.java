class Solution {
    public int dominantIndex(int[] nums) {
        int c=0;
        int max = nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                c=i;}}
                 for(int i =0;i<nums.length;i++){
                    if(i!=c&&max < (2L*nums[i])){
                        return -1;}} 
                    return c;}}