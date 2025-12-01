class Solution {
    public long maxTotalValue(int[] nums, int k) {
        Long max = Arrays.stream(nums).mapToLong(i -> i).max().getAsLong();
        Long min = Arrays.stream(nums).mapToLong(i -> i).min().getAsLong();
        Long sub = max - min;
        return sub*(long)k;
    }
}