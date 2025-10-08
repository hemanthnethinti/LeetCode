class Solution {
    public static int array(int spell, long success, int[] potions) {
        int left = 0, right = potions.length - 1;
        int n = potions.length;
        int ans = n; 
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long product = (long) spell * potions[mid]; 
            if (product >= success) {
                ans = mid; 
                right = mid - 1; 
            } else {
                left = mid + 1; 
            }
        }
        return n - ans;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        Arrays.sort(potions);
        for (int i = 0; i < n; i++) {
            spells[i] = array(spells[i], success, potions);
        }
        return spells;
    }
}