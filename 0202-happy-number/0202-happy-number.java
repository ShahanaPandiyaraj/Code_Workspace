class Solution {
    public boolean isHappy(int n) {
    int digit,sum;
    if (n < 1) {
            return false;
        }
    while(n>9){
    sum=0;
    while(n>0){
    digit=n%10;
    sum+=digit*digit;
    n/=10;
    } 
    
    n=sum;
    }
    if (n==1||n==7){
        return true;
    }
    else{
        return false;
    }
    
 }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna