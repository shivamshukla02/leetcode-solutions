class Solution {
public:
    int countEven(int num) {
       int c=0;
     for(int i=1;i<=num;i++){
        int temp=i;
        int sum=0;
        while(temp>0){
        int digit = temp%10;
        sum+=digit;
        temp=temp/10;}
        if(sum%2==0){
            c++;
        }
        }   return c;
    }
};