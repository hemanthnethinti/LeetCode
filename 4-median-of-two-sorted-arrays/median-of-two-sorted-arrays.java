class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] newArr = new int[m+n];
        int idx=0;
        for(int i=0;i<m;i++){
            newArr[idx]=nums1[i];
            idx++;
        }
        for(int j=0;j<n;j++){
            newArr[idx]=nums2[j];
            idx++;
        }
        Arrays.sort(newArr);
    
        for(int i=0;i<m+n;i++){
            int l = newArr[0];
            int h = newArr[(m+n)-1];
            int  mid = ((m+n))/2;
            if((m+n)%2==0){
                return (float)(newArr[mid]+newArr[mid-1])/2.0;
            }
            else {
                return (float)newArr[mid];
            }
        }
    return 0;
    }
}