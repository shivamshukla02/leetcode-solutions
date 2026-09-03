class Solution {
    public int differenceOfSum(int[] nums) {
        int es=0;
        for(int i =0;i<nums.length;i++){
            es=es+nums[i];
        }
        int ds=0;
        for(int i =0;i<nums.length;i++){
            while(nums[i]>0){
                int d = nums[i]%10;
                ds=ds+d;
                nums[i]=nums[i]/10;
            }}
            return Math.abs(es-ds);
    }
}