class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // Handle edge case where the array is empty or null.
        }

        int maxProduct = nums[0]; // Initialize maxProduct to the first element of the array.
        int minProduct = nums[0]; // Initialize minProduct to the first element of the array.
        int result = nums[0];     // Initialize the result to the first element of the array.

        for (int i = 1; i < nums.length; i++) {
            int temp = maxProduct; // Store the current maxProduct in a temporary variable.

            // Update maxProduct with the maximum of three values:
            // 1. The current element nums[i]
            // 2. The product of the current element and the previous maxProduct
            // 3. The product of the current element and the previous minProduct (to handle negative numbers)
            maxProduct = Math.max(Math.max(nums[i], maxProduct * nums[i]), minProduct * nums[i]);

            // Update minProduct with the minimum of three values:
            // 1. The current element nums[i]
            // 2. The product of the current element and the previous temp (previous maxProduct)
            // 3. The product of the current element and the previous minProduct
            minProduct = Math.min(Math.min(nums[i], temp * nums[i]), minProduct * nums[i]);

            // Update the result with the maximum of the result and the current maxProduct.
            result = Math.max(result, maxProduct);
        }
        return result; // Return the final result, which is the maximum product of any subarray.
    }
}
