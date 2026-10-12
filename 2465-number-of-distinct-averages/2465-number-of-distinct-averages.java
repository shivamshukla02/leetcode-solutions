class Solution {
    public int distinctAverages(int[] nums) {
         int n = nums.length;
        double[] averages = new double[n / 2];  
        Arrays.sort(nums);
        for (int i = 0; i < n / 2; i++) {
            averages[i] = (nums[i] + nums[n - 1 - i]) / 2.0;}
        Arrays.sort(averages);
        int c=1;
       for(int i=0;i<averages.length-1;i++){
        if(averages[i]!=averages[i+1]){
            c++;
        }
       }
       return c;
    }
}