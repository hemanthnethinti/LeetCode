class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" "); // split by spaces
        int count = 0;

        for (String word : words) {
            boolean valid = true;
            for (char c : brokenLetters.toCharArray()) {
                if (word.indexOf(c) != -1) { 
                    valid = false;
                    break;
                }
            }
            if (valid) count++;
        }
        return count;
    }
}