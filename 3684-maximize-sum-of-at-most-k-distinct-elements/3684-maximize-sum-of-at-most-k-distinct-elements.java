class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> s = new LinkedHashSet<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (s.size() < k) {
                s.add(nums[i]);
            } else {
                break;}}
        int ans[] = new int[s.size()];
        int j = 0;
        for (int x : s) {
            ans[j++] = x;}
        return ans;}}
