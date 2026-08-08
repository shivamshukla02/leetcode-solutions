class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n;
        int f=1;
        int sum=0;
        while(temp>0){
            int digit = temp%10;
            sum+=digit;
            f*=digit;
            temp=temp/10;
        } return (f-sum);
    }
}