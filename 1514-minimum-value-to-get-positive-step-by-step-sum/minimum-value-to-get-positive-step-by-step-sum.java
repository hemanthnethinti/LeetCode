class Solution {
    public int minStartValue(int[] nums) {
        int prefixSum = 0;
        int minPrefix = Integer.MAX_VALUE;

        for (int num : nums) {
            prefixSum += num;
            minPrefix = Math.min(minPrefix, prefixSum);
        }

        return minPrefix >= 0 ? 1 : 1 - minPrefix;
    }
}
