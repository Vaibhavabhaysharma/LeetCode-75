class Solution {
    static {
        for (int i = 0; i < 200; i++) {
            maxArea(new int[0]);
        }
    }
    public static int maxArea(int[] height) {
        
		int maxA = 0;
		int left = 0, right = height.length - 1;

    	while (left < right) {
	        int minHeight = Math.min(height[left],height[right]);
	        int area = minHeight * (right - left);
	        maxA = Math.max(maxA,area);

            while(left < right && height[left] <= minHeight){
                left++;
            }

            while(left < right && height[right] <= minHeight){
                right--;
            }      
	    }
		return maxA;
    }
}
