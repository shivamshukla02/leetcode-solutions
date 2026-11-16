class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length - 1];

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > min) {
                list.add(min);
                min++;
            }

            if (nums[i] == min) {
                min++;
            }
        }

        return list;
    }
}