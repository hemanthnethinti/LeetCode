class Solution {
    public int minFlips(String target) {
        int count = 0;
        int a = 0;
         for(int i=0;i<target.length();i++){
            if(target.charAt(i)=='1'){
                a = i;
                break;
            }
         }
         int b =1;
         for(int i=a;i<target.length();i++){
            if(target.charAt(i)=='0' && b==1){
                count++;
                b=0;
            }
            else if(target.charAt(i)=='1' && b==0){
                count++;
                b=1;
            }
         }
         if(a==0 && target.charAt(0)!='1'){
            return 0;
         }
         else{
         return count+1;
         }
    }
}