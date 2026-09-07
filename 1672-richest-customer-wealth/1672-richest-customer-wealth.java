class Solution {
    public int maximumWealth(int[][] a) {
    int max=0;
    for(int i=0;i<a.length;i++) {
    int c=0;
    for(int j=0;j<a[0].length;j++){
        c+=a[i][j];
    }
    if(c>max){
        max=c;
    }
    }
    return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna