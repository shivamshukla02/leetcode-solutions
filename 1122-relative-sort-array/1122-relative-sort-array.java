class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer>list = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                list.add(arr1[i]);
                arr1[i]=-1;}
                i++;
            if(i==arr1.length){
                i=0;
                j++;}}
        Arrays.sort(arr1);
        for(int n:arr1){
            if(n!=-1){
                list.add(n);}}
        int ans[]=new int[list.size()];
        for(int k=0;k<list.size();k++){
            ans[k]=list.get(k);}
    return ans;}}