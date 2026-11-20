class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0;
        int r = 0;
        int u = 0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L') l++;
            else if(moves.charAt(i)=='R') r++;
            else u++;}
            int m = Math.max(l,r);
            int p=m+u;
            if(m==l) return p-r;
            return p-l;

       
    }
}
