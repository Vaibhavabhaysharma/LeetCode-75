class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
		int right = 1;
		int maxSum = nums[0];
		double result=-Double.MAX_VALUE;
		if(k==1){
			for (int i=0;i<nums.length;i++) {
				maxSum = (maxSum < nums[i])?nums[i]: maxSum;
			}
		return maxSum;
		}else{
			while(right<nums.length){
				maxSum+=nums[right];
				if((right+1)-(left)==k){
					double maxAvg= (double)maxSum/k;
					result = maxAvg>result?maxAvg:result;
					maxSum-=nums[left];
					left++;
				}
				right++;
			}
		}

		return result;
    }
}
