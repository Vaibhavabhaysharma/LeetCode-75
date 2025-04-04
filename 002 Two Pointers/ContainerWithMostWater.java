class Solution {
    public int maxArea(int[] height) {
        
		int maxA = 0;
		int left = 0, right = height.length - 1;

    	while (left < right) {
	        int minHeight = height[left]<height[right]?height[left]:height[right];
	        int area = minHeight * (right - left);
	        maxA = maxA>area?maxA:area;

	        if (height[left] < height[right]) {
	            left++;
	        } else {
	            right--;
	        }
	    }
		return maxA;
    }
}
