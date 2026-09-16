class Solution {
    public void reverseString(char[] s) {
    
     char[] res=new char[s.length];
     for(int i=s.length-1;i>=0;i--) {
     res[s.length-1-i]=s[i];
    }  
     for (int i = 0; i < s.length; i++) {
            s[i] = res[i];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna