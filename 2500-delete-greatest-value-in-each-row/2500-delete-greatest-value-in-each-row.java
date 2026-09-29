class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] row : grid) {
            Arrays.sort(row);}
        int ans = 0;
        for (int col = 0; col < grid[0].length; col++) {
            int maxInCol = 0;
            for (int row = 0; row < grid.length; row++) {
                maxInCol = Math.max(maxInCol, grid[row][col]);
            }
            ans += maxInCol;
        }
        
        return ans;
    }
}