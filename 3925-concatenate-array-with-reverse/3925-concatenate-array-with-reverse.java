class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];}
        int start =0;
        int end = n-1;
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]=temp;
            start++;
            end--;}
            for(int i=0;i<n;i++){
                 ans[i+n]=nums[i];}
                 return ans;
    }
}