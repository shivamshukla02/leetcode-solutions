class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long sum =0;
            Arrays.sort(nums);
            for(int i=nums.length-1;i>=0;i--){
                if(k==0){
                    break;}
                if(mul>1){
                   long current = (long)nums[i]*mul;
                   sum+=current;
                   mul--;
                   k--;}
                   else {
                    sum+=nums[i];
                    k--;}}
                return sum;}}
