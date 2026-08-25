class Solution {
    public void sortColors(int[] nums) {
    for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums.length;j++){
            if(nums[j]>nums[i]){
                int t=nums[j];
                nums[j]=nums[i];
                nums[i]=t;
            }
        }
    }    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna