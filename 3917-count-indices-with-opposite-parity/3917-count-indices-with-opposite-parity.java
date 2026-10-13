class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((nums[i] % 2) != (nums[j] % 2)) {
            ans[i]++;
        }
    }
            }
            return ans;
        }
    }