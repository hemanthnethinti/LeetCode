class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }

        int longest = 0;

        for(int n : set){

            if(!set.contains(n - 1)){   // start of sequence

                int current = n;
                int length = 1;

                while(set.contains(current + 1)){
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}