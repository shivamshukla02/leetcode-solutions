class Solution {
    public int maximumWealth(int[][] accounts) {
        int a[]=new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[0].length;j++){
                sum=sum+accounts[i][j];}
                a[i]=sum;}
                Arrays.sort(a);
                return a[a.length-1];}}