class Solution {
public:
    bool checkDivisibility(int n) {
         int temp = n;
        int s=0;
        int f=1;
        while(temp>0){
            int d = temp%10;
            s=s+d;
            f=f*d;
            temp=temp/10;
        }
        if(n%(s+f)==0){
            return true;
        }
        return false;
    }
};