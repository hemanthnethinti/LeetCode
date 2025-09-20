class Solution {
    public int mySqrt(int N) {
           int msb = (int)(Math.log(N) / Math.log(2));

        // (a = 2^msb)
        int a = 1 << msb;
        long result = 0;
        while (a != 0) {

            // Check whether the current value
            // of 'a' can be added or not
            if ((result + a) * (result + a) <= N) {
                result += a;
            }

            // (a = a/2)
            a >>= 1;
        }

        // Return the resul
        int res = (int)result;
        return res;
    
    }
}