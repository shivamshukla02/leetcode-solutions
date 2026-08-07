class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1=0;
        int rev2=0;
        int temp=num;
        while(temp>0){
            int digit1 = temp%10;
            rev1=rev1*10+digit1;
            temp=temp/10;
        } while(rev1>0){
            int digit2 = rev1%10;
            rev2=rev2*10+digit2;
            rev1=rev1/10;}
             if(rev2==num){
            return true;
        } return false;
    }
}