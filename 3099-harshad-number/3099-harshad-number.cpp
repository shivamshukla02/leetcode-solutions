class Solution {
public:
    int sumOfTheDigitsOfHarshadNumber(int x) {
           int s=0;
        int t=x;
        while(t>0){
            int d = t%10;
            s+=d;
            t/=10;}
            if(x%s==0){
                return s;
            }
            return -1;
    }
};