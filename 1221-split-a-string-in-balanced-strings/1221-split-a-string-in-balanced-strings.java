class Solution {
    public int balancedStringSplit(String s) {
        int ans=0;
        int balance=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                balance+=1;
            }
            else{
                balance-=1;
            }
            if(balance==0){
                ans+=1;
            }
        }
        return ans;
    }
}