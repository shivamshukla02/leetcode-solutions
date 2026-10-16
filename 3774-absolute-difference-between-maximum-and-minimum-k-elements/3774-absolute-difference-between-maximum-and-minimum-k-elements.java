class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int sumL=0;
        int sumS=0;
        int start=0;
        int end=nums.length-1;
        while(k-->0){
            sumL+=nums[end--];
            sumS+=nums[start++];}
            return Math.abs(sumL-sumS);
    }
}