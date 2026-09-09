class Solution {
    public boolean squareIsWhite(String coordinates) {
        char p = coordinates.charAt(0);
        int row = coordinates.charAt(coordinates.length() - 1) - '0';
        if ((row % 2 == 0) &&
            (p == 'a' || p == 'c' || p == 'e' || p == 'g')) {
            return true;}
        if ((row % 2 != 0) &&
            (p == 'b' || p == 'd' || p == 'f' || p == 'h')) {
            return true;}
        return false;}}
