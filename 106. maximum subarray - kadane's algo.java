class Solution {
    public int maxSubArray(int[] nums) {
        // kadane's algorithm
        int max_at_i = nums[0];
        int maxSum = nums[0];
        if(nums.length==1){
            return nums[0];
        }
        for ( int i =1; i<nums.length;i++){
            max_at_i = Math.max(nums[i], max_at_i+nums[i]);
            maxSum = Math.max(maxSum, max_at_i);
        }
        return maxSum;
    }
}