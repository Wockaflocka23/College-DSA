class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

      
        Arrays.sort(nums);

        int longest = 1;
        int cnt = 1;

       
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
               
                continue;
            } else if (nums[i] == nums[i - 1] + 1) {
               
                cnt++;
            } else {
               
                longest = Math.max(longest, cnt);
                cnt = 1;
            }
        }

       
        longest = Math.max(longest, cnt);

        return longest;
    }
}
