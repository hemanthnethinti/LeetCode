class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr2.length;
        int m = arr1.length;
        int k = arr1.length;
        int[] arr = new int[k];
        int s = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(arr2[i]==arr1[j]){
                      arr[s++]=arr2[i];
                      arr1[j]=-1;
                }
            }
        }
        Arrays.sort(arr1);
        for(int i = 0;i<m;i++){
            if(arr1[i]!=-1){
                k = i;
                arr[k] = arr1[i];
            }
        }
        return arr;
    }
}