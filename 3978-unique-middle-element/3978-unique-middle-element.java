class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length/2;
        int middle = nums[n];
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(middle==nums[i]&&i!=n){
               return false;
            }
        }
       
        return true;
    }
}