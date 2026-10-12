class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sum=0;
        for(int i=0;i<requests.length;i++){
            if(i==0){
                sum+=requests[i];}
                else{
                    int time = Math.abs(requests[i]-requests[i-1]);
                    sum+=time;
                }
        }
        return sum;
    }
}