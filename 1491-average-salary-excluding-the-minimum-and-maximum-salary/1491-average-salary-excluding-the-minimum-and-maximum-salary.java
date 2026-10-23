class Solution {
    public double average(int[] salary) {
        int minsalary = Integer.MAX_VALUE;
    int maxsalary = Integer.MIN_VALUE;
    double sum = 0; 
    for (int i = 0; i < salary.length; i++) {
        if (salary[i] < minsalary) {
            minsalary = salary[i];}
        if (salary[i] > maxsalary) {
            maxsalary = salary[i];}
        sum += salary[i];}
    return (sum - minsalary - maxsalary) / (salary.length - 2);}}