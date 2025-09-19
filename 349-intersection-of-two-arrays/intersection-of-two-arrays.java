class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        int n = nums1.length;
        int m = nums2.length;
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                hs.add(nums1[i]);
                }
            }
        }int l=hs.size();
        int[] arr = new int[l];
        int j=0;
        for(int i:hs){
            arr[j] = i;
            j++;
        }
        return arr;
    }
}