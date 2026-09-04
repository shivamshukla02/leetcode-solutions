class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a[] = new int[2];
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < n; j++) {
                if(i + j == n) {
                    if(!String.valueOf(i).contains("0") && !String.valueOf(j).contains("0")) {
                        a[0] = i;
                        a[1] = j;
                        return a; }}}}
        return a; 
    }
}