class Solution {
    public int binaryGap(int n) {
        int lastIndex = -1;
        int maxDistance = 0;
        int currentIndex = 0;
        
        while (n > 0) {
            if ((n & 1) == 1) {
                if (lastIndex != -1) {
                    maxDistance = Math.max(maxDistance, currentIndex - lastIndex);
                }
                lastIndex = currentIndex;
            }
            
            n >>= 1;
            currentIndex++;
        }
        
        return maxDistance;
    }
}