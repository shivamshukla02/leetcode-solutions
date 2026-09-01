class Solution {
    public int[] searchRange(int[] nums, int target) {
           int s1=0;
      int e1=nums.length-1;
      int first =-1;
      while(s1<=e1){
          int mid1 = s1+(e1-s1)/2;
          if(nums[mid1]==target){
              first=mid1;
              e1=mid1-1;}
          else if(target < nums[mid1]){
             e1=mid1-1;}
          else{
              s1=mid1+1;}}
      int s2=0;
      int e2=nums.length-1;
      int last =-1;
      while(s2<=e2){
          int mid2 = s2+(e2-s2)/2;
          if(nums[mid2]==target){
              last=mid2;
            s2=mid2+1;}
          else if(target<nums[mid2]){
              e2 = mid2 - 1;;}
          else{
               s2 = mid2 + 1;;}
      } return new int[]{first,last};}}