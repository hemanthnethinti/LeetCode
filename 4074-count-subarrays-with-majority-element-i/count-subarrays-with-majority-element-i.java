class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans = 0;
        for(int start = 0; start < nums.length; start++) {
            int targetCount = 0;
            for(int end = start; end < nums.length; end++) {
                if(nums[end] == target)
                    targetCount++;
                int length = end - start + 1;
                if(targetCount > length / 2)
                    ans++;
            }
        }

        return ans;
    }
}