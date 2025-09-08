class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int a = 1; a < n; a++) {
            int b = n - a;
            if (isNoZero(a) && isNoZero(b)) {
                return new int[]{a, b};
            }
        }
        return new int[]{-1, -1}; // should never happen due to problem guarantee
    }

    private boolean isNoZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) return false; // digit '0' found
            num /= 10;
        }
        return true;
    }
}
