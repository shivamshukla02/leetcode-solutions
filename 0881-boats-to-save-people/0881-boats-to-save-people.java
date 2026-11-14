class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int c =0;
        int low =0;
        int high = people.length-1;
        while(low<=high){
            if(people[low]+people[high]<=limit){
                c++;
                low++;
                high--;}
                else {
                    c++;
                    high--;
                }
               
        }
        return c;
    }
}