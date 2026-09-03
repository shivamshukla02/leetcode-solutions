class Solution {
public:
    int digitFrequencyScore(int n) {
        int d=0;
     while(n>0){
        int digit=n%10;
        d=d+digit;
        n=n/10;
     } return d;   
    }
};