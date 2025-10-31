class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }
        int[] result = new int[duplicates.size()];
        for (int i = 0; i < duplicates.size(); i++) {
            result[i] = duplicates.get(i);
        }

        return result; 
    }
}