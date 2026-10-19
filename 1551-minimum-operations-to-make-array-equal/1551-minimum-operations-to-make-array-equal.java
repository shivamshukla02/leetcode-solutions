class Solution {
    public int minOperations(int n) {
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=(2*i)+1;}
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];}
            int avg = sum/n;
        int diff=0;
        for(int i=0;i<n/2;i++){
            diff+=Math.abs(arr[i]-avg);}
            return diff;

      


    }
}