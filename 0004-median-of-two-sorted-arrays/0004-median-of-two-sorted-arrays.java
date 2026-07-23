class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merged[]=new int[nums1.length+nums2.length];
        int index=0;
        for (int i=0;i<nums1.length;i++){
            merged[index]=nums1[i];
            index++;
        }
        for (int i=0;i<nums2.length;i++){
            merged[index]=nums2[i];
            index++;
        }
        Arrays.sort(merged);
        int total=merged.length;
        if (total %2!=0){
            return merged[total/2];
        }
        else{
         return (merged[(total / 2) - 1] + merged[total / 2]) / 2.0  ;
        }
        

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna