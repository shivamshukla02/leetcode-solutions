class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        StringBuilder s = new StringBuilder();
        int t=num;
       while(t!=0){
        int d = t%7;
        s.append(Math.abs(d));
        t=t/7;
       }
       if(num<0){
        s.append("-");
       }
       return s.reverse().toString();
    }
}