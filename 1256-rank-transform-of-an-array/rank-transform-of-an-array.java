import java.util.*;

class Solution {
    // Modified to look up the position instantly without a slow loop
    public int cnt(int n, List<Integer> sortedList) {
        // Binary search instantly finds the exact index of 'n' in the sorted list.
        // Since it's 0-indexed, the index is exactly the number of elements smaller than 'n'.
        return Collections.binarySearch(sortedList, n) + 1;
    }

    public int[] arrayRankTransform(int[] arr) {
        // Step 1: Collect unique elements in sorted order
        Set<Integer> set = new TreeSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Convert the set to a List so we can search it instantly by index
        List<Integer> sortedList = new ArrayList<>(set);

        int b = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // Step 2 & 3: Run your exact loop structure
            b = cnt(arr[i], sortedList);
            arr[i] = b;
        }
        return arr;
    }
}
