class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
     int m =   capacity.length;
     int n =  apple.length;
     int sum = 0;
     for(int i=0;i<n;i++){
        sum+=apple[i];}
        int c=0;
        int csum=0;
        Arrays.sort(capacity);
        for(int i=m-1;i>=0;i--){
            if(csum>=sum){
                return c;}
                csum+=capacity[i];
                c++;
        }
        return c;

    }
}