class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int totalsum=0;int leftsum=0;
        for(int i=0;i<n;i++){
            totalsum+=nums[i];
        }
        for(int j=0;j<n;j++){
            totalsum-=nums[j];
        
            if(leftsum==totalsum){
                return j;
            }
            else{
                leftsum+=nums[j];
                
            }
        }
            return -1;
        }
        
    }
