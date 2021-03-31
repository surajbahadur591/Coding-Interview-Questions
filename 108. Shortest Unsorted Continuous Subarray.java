class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if (nums.length <= 1)
            return 0;
        int ll = 0, l = 0;
        int rr = nums.length - 1, r = nums.length - 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // find start point when ascending is over
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                ll = i + 1;
                break;
            }
        }
        // if all ascending, means already sorted, return 0
        if (ll == 0)
            return 0;
        // find min after the turn point
        for (int i = ll; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        // find the position of the min in the ascending array, which is start point from left
        for (int i = 0; i < ll; i++) {
            if (min < nums[i]) {
                l = i;
                
                
                break;
            }
        }
        
        // do the same to find the end point from right
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] < nums[i - 1]) {
                rr = i - 1;
                break;
            }
        }
        for (int i = rr; i >= 0; i--) {
            max = Math.max(max, nums[i]);
        }
        for (int i = nums.length - 1; i >= rr + 1; i--) {
            if (nums[i] < max) {
                r = i;
                break;
            }
        }

        return r - l > 0 ? r - l + 1 : 0;
    }
}
