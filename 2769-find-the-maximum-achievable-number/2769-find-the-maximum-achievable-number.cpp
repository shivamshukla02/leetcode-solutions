class Solution {
public:
    int theMaximumAchievableX(int num, int t) {
         for(int i=1;i<=t*2;i++){
            num++;
        }
        return num;
    }
};