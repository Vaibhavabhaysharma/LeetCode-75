class Solution {
    public int longestSubarray(int[] nums) {
        int zeroCount = 0;
		int maximum = 0; 
		int left=0;
		for (int right=0;right<nums.length;++right) {
			if(nums[right] == 0){
				zeroCount++;
			}
			while(zeroCount>1){
				if(nums[left]==0){
					zeroCount--;
				}
				left++;
			}
			maximum = Math.max(maximum,right-left);
		}
		return maximum;
    }
}
