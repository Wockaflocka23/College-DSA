class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int even = 0, odd = nums.length - 1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[even++] = nums[i];
            } else {
                arr[odd--] = nums[i];
            }
        }
        
        return arr;
    }
}
