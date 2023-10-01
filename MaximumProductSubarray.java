//https://leetcode.com/problems/maximum-product-subarray/description/

class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for(int i=1;i<nums.length;i++){
            int temp = maxProduct;
            maxProduct = Math.max(Math.max(nums[i], maxProduct*nums[i]), minProduct*nums[i]);

            minProduct = Math.min(Math.min(nums[i], temp*nums[i]), minProduct*nums[i]);

            result = Math.max(result, maxProduct);
        }
        return result;
    }
}
