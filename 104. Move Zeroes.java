class Solution {
    public void moveZeroes(int[] nums) {
        int i=0 , j;
        for ( j = 0; j<nums.length;j++){
            if(nums[j]!=0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i]= temp;
                i++;
            }
        }
    }
}

