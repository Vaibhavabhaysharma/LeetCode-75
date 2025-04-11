class Solution {
    public static int pivotIndex(int[] nums){

		int result = -1;
		int pivotInd = -2;

		pivotInd = pivotCheck(pivotInd, nums);
		result = pivotInd>result?pivotInd:result;
		return result;
	}

	public static int pivotCheck(int pivotInd, int[] nums){
		
		int leftSum =0;
		int rightSum=0;
		int currentSum=0;
		for(int i=0; i<nums.length; i++){
			currentSum+=nums[i];
		}
		for(int i=0; i<nums.length; i++){
			rightSum = currentSum-nums[i];
			currentSum = rightSum;
			if(leftSum == rightSum){
				return i;
			}
			leftSum+= nums[i];
		}
		return pivotInd;
	}
}
