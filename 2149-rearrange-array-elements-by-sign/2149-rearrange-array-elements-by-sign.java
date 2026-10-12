class Solution {
    public int[] rearrangeArray(int[] nums) {
        int nc=0;
        int pc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){pc++;}
            else{nc++;}}
            int pos[] = new int[pc];
            int neg[] = new int[nc];
            int j =0;
            int k=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>0){
                    pos[j++]=nums[i];}
                else{
                    neg[k++]=nums[i];}}
                    int a = 0;
                    int b = 0;
                 int ans[] = new int[nums.length];
                 for(int i=0;i<nums.length;i++){
                    if(i%2==0){
                    ans[i]=pos[a++];}
                    else{
                    ans[i]=neg[b++];}
                 }   
return ans;
    }
}