class Solution {
    public int earliestTime(int[][] tasks) {
   int ans[]=new int[tasks.length];
        for(int i=0;i<tasks.length;i++){
            int sum=0;
            for(int j=0;j<tasks[0].length;j++){
                sum=sum+tasks[i][j];}
               ans[i]=sum;}
               Arrays.sort(ans);
               return ans[0];
               
               }
}