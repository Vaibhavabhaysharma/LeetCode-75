class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
		
		result[0] = 0;
		if(n>0)result[1] = 1;

        for (int i = 2; i<n+1; i++) {
        	if(i%2 == 0){
        		// even
        		result[i] = result[i/2];
        	}else{
        		// odd
        		result[i] = result[(i-1)/2]+1;
        	}
        }
    	return result; 
    }
}
