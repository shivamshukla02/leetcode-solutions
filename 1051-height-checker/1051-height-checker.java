class Solution {
    public int heightChecker(int[] heights) {
        int c = 0;
        int expected[]=new int[heights.length];
        for(int i=0;i<expected.length;i++){
            expected[i]=heights[i];
        }
        Arrays.sort(expected);
        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != expected[i]) {
                c++;
            }
        }
        return c;
    }
}