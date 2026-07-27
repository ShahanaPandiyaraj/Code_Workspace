class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            // Pick a new candidate when counter hits 0
            if (count == 0) {
                candidate = num;
            }

            // Increment if match, decrement if different
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna