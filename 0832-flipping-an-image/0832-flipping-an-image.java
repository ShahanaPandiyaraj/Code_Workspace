class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            
            while (left <= right) {
              
                if (image[i][left] == image[i][right]) {
                    int flipped = image[i][left] ^ 1; 
                    image[i][left] = flipped;
                    image[i][right] = flipped;
                }
               
                
                left++;
                right--;
            }
        }
        
        return image;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna