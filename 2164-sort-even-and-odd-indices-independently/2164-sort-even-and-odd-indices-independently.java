class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        int[] a = new int[(n + 1) / 2]; 
        int[] b = new int[n / 2];       
        int j = 0, k = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) a[j++] = nums[i];
            else b[k++] = nums[i];}
        Arrays.sort(a);
        Arrays.sort(b);
        int[] ans = new int[n];
        int q = 0;
        int p = b.length - 1; 
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) ans[i] = a[q++];
            else ans[i] = b[p--];}
        return ans;}}