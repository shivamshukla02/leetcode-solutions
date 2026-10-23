class Solution {
    public int[] numberOfPairs(int[] nums) {
        int n = nums.length;
        int ans[]=new int[2];
        int x=0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                x++; i++;
              
            }
        }
          int y=n-(2*x);
        ans[0] = x;
        ans[1] = y;
        return ans;

    }
}