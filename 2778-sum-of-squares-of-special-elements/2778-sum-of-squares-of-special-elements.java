class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum=0;
          int j=1;
        for(int i=0;i<nums.length;i++){
            if(n%j==0){
                int temp=nums[i]*nums[i];
                sum+=temp;}j++;}
                return sum;
    }
}