class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n = nums.length * 2;
        int[] arr = new int[n];
        for(int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];             
            int temp = nums[i];
            int rev = 0;
            while(temp > 0) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp = temp / 10;}
            arr[i + nums.length] = rev; }
        Arrays.sort(arr);
        int c = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i] == arr[i - 1]) {
                c++;}}
        return n - c;}}