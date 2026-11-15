class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int c = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                if (c < k) {
                    list.add(nums[i]);
                    c++;
                }
            } else {
                if (c < k) {
                    list.add(nums[i]);
                }
                c = 0;
            }
        }
        if (c < k) {
            list.add(nums[nums.length - 1]);
        }
        int ans[] = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}