class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int j = 0;
        int cnt=0;
        for(int i = 0;i<n;i++){
            if(nums[i]!=0){
                temp[j++]=nums[i];
                cnt++;
            }
        }for(int i = cnt;i<n;i++){
            temp[i]=0;
        }for(int i = 0;i<n;i++){
            nums[i]=temp[i];
        }

    }
}