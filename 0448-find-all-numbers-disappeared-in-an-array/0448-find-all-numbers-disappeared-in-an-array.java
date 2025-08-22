class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> output = new ArrayList<>();
        int[] freq = new int[nums.length];
        for(int n : nums) {
            freq[n-1]++;
        }
        for(int i=0;i<freq.length;i++) {
            if(freq[i] == 0) output.add(i+1); 
        }
        return output;
    }
}