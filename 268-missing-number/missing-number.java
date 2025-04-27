class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int maxsum=0;
        int sum=(n*(n+1)/2);
        for(int i=0;i<=nums.length-1;i++){
            maxsum+=nums[i];
          
                
            
            
             }
              return sum-maxsum;
    }
}