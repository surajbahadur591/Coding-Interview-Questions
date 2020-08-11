class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<>();
        int sum=0, i;
        for(i = 0; i<nums.length ; i++){
            sum = target - nums[i];
            if(map.containsKey(sum))
                return new int[] {map.get(sum), i };  // returns index of first and second element where i is the index of first number
            else 
                map.put(nums[i], i); //putting the number with index i in hashmap
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}