class Solution {
public:
    int findClosest(int x, int y, int z) {
   int a=0;
        int b=0;
        while(x!=z){
            a++;
            if(x>z){
                x--;} 
            else{
                x++;}}
         while(y!=z){
            b++;
            if(y>z){
                y--;} 
            else{
                y++;}}
        if(a>b){
            return 2;}
        if(b>a){
            return 1;}
        return 0;      
    }
};