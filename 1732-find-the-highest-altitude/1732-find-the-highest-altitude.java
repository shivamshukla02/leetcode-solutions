class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int ans[]= new int[gain.length+1];
        ans[0]=0;
        for(int i=1;i<gain.length+1;i++ ){
            sum+=gain[i-1];
            ans[i]=sum;}
            int max = ans[0];
            for(int i=0;i<ans.length;i++){
                if(ans[i]>max){
                    max = ans[i];
                }
            }
            return max;
        
    }
}