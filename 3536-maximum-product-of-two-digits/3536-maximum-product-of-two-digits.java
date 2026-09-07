class Solution {
    public int maxProduct(int n) {
        int c=0;
     int   temp=n;
        while(temp>0){
            temp=temp/10;
            c++;}
            int a[] = new int[c];
            for(int i=0;i<c;i++){
                int d=n%10;
                a[i]=d;
                n=n/10;}
                Arrays.sort(a);
                int p = a[a.length-1]*a[a.length-2];
                return p;
            }
}