class Solution {
    public int maxOperations(int[] nums, int k) {
        int c=0;
       Arrays.sort(nums);
       int low = 0;
       int high = nums.length-1;
       while(low<high){
        if(nums[low]+nums[high]<k){
            low++;
        }
        else if(nums[low]+nums[high]==k){
            c++;
            low++;
            high--;
        }
        else{
            high--;
        }
       }
       return c;}}