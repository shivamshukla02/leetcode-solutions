class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        
        long c = 0;
        int n = skill.length;
        int target = skill[0] + skill[n - 1];
        
        int low = 0;
        int high = n - 1;
        
        while (low < high) {
            if (skill[low] + skill[high] != target) {
                return -1;
            } else {
                c += (long) skill[low] * skill[high];
                low++;
                high--;
            }
        }
        
        return c;
    }
}