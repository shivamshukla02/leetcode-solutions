class Solution {
    public int maximum69Number (int num) {
        int c=0;
        int temp = num;
        while(temp>0){
            temp=temp/10;
            c++;}
        int a [] = new int [c];
        for(int i=0;i<c;i++){
            a[i]=num%10;
            num=num/10;
        }
     for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == 6) {
                a[i] = 9;
                break;
            }
        }
        int sum=0;
        for(int i=a.length-1;i>=0;i--){
            sum = sum*10+a[i];
        }
        return sum;
    }
}