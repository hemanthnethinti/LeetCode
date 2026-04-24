class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int ans = 0;
        int l =0;
        int r =0;
        HashSet<Character> set = new HashSet<>();
        for(int i =0; i<moves.length(); i++){
            char ch = moves.charAt(i);
            set.add(ch);
            if(ch=='L'){
                l++;
            }else{
                if(ch=='R'){
                r++;
                }
            }
        }
          if((l+r)==moves.length()){
            if(l>=r) return l-r;
            if(r>=l) return r-l;
          }
        if(set.size()==1 || set.size()==2) return moves.length();
        int n = moves.length();
        for(int i =0; i<n; i++){
            char ch = moves.charAt(i);
            if(ch=='L' || (l>r && ch=='_')){
                ans++;
            }else{
                ans--;
            }
        }
        return Math.abs(ans);
    }
}