class Solution {
    public int findNumbers(int[] nums) {
    int t=0;
    for(int c:nums){
        int sum=0;
        while(c>0){
            sum=sum+1;
            c=c/10;
        }
        if(sum%2==0){
        t=t+1;}
    }
    return t;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna