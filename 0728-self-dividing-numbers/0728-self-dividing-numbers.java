class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> a = new ArrayList<>();
        for(int i = left; i <= right; i++){
            int temp = i;
            int s = 0; 
            while(temp > 0){
                int d = temp % 10;
                if(d == 0 || i % d != 0){
                    s = 1;}
                temp = temp / 10; }
            if(s == 0){
                a.add(i);} }
        return a;
    }
}