class Solution {
    public boolean checkGoodInteger(int n) {
        if(squareSum(n) - digitSum(n) >= 50){
            return true;
        }
        return false;
    }
    public int digitSum(int a){
        int sum=0;
        while(a>0){
            int digit=a%10;
            sum = sum+digit;
            a=a/10;
        } return sum;
    }

     public int squareSum(int b){
        int sq=0;
        while(b>0){
            int digit=b%10;
            sq = sq+(digit*digit);
            b=b/10;
        } return sq;
    }
}