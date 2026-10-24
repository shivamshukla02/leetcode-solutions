class Solution {
public:
    int findKthPositive(vector<int>& arr, int k) {
         int c=0;
        for(int i=0,j=1; ;j++){
           if (i == arr.size() || j != arr[i]){
                c++;}
                if(i<arr.size() && j==arr[i]){
                    i++;
                }
                if(c==k){
                    return j;
                }
        }
    }
};