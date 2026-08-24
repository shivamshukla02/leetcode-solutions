class Solution {
public:
    int addDigits(int num) {
    if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;}
};
/*while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10; // Add the last digit to sum
                num = num / 10;  // Remove the last digit from num
            }
            num = sum; // Set num to the new sum for the next check
        }
        return num;
    }*/