class Solution {
    public int passwordStrength(String password) {
        boolean[] seen = new boolean[128];
        int sum = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (seen[c]) {
                continue;
            }
            seen[c] = true;

            if (c >= 'a' && c <= 'z') {
                sum += 1;
            }
            else if (c >= 'A' && c <= 'Z') {
                sum += 2;
            }
            else if (c >= '0' && c <= '9') {
                sum += 3;
            }
            else {
                sum += 5;
            }
        }
        return sum;
    }
}