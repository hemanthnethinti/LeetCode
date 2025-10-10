class Solution {
    public long coloredCells(int n) {
        if(n==1){
            return 1;
        }
        long sum = 1;
        for(int i = 1;i<n;i++){
            sum += 4*i;
        }
        // long b = n;
        // long a = (b*b)+((b-1)*(b-1));
        // return a;
        return sum;
    }
}