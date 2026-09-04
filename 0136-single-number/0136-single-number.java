class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i=i+1){
            ans = ans^nums[i];
            }
        
       return ans; 
    }
}