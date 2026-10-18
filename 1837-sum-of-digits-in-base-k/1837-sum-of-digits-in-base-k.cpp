class Solution {
public:
    int sumBase(int n, int k) {
        int sum1=0;
        while(n>0){
                sum1+=n%k;
                n=n/k;}
        return sum1;
    }
};