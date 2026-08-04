class Solution {
    public boolean isPalindrome(int x) {
      int rev=0;
      if (x<0){
        return false;
      }
      int num=x;
     while(x!=0){
        int digit=x%10;
        rev=rev*10+digit;
        x=x/10;
     }   
    return num==rev;
     }
    }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna