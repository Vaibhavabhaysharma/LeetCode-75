class RecentCounter {
    // Optimal solution with use of int array instead Queue
    private static final int[] records = new int[10000];
    private int start;
    private int end;
    
    public RecentCounter() {
        start=0;
    	end=0;
    }
    
    public int ping(int t) {
        while(start<end && (t - records[start]>3000)){
    		start++; // if difference in time is greater than 3000ms
    		// increase the value of start until it is equal or less than 3000ms
    	}
    	records[end++] = t; // inserting current time at the end
   		return end-start; // returning the count of recent calls
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
