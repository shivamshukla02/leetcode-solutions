class Solution {
    public int maximumDifference(int[] nums) {
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                  int  diff = Math.abs(nums[i]-nums[j]);
                    if(diff>max){
                        max=diff;
                    }}}}
                    if(max ==Integer.MIN_VALUE){
                        return -1;
                    }
                    return max;

            }
        }