class Solution {
    public boolean detectCapitalUse(String word) {
        int c = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                c++;
            }
        }

        if (c == word.length() || c == 0) {
            return true;
        }

     
        return c == 1 && Character.isUpperCase(word.charAt(0));
    }
}
     
    
    



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna