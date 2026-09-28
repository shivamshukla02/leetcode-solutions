class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        while(n!=1){
            int newNums[] = new int[nums.length-1];
            for(int i=0;i<newNums.length;i++){
                int temp = nums[i];
                newNums[i]=(nums[i]+nums[i+1])%10;
                nums[i]=newNums[i];}n--;}
                return nums[0];
    }
}