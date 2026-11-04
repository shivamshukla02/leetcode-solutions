class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int j = nums.length-1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length/2;i++){
            int sum=nums[i]+nums[j--];
            if(sum>max){
                max = sum;}}
                return max;
    }
}