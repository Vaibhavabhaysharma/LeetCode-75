class Solution {
    public int largestAltitude(int[] gain) {
        int highestAlt = 0;
		int currentAlt = 0;
		for (int i=0; i<gain.length; i++) {
			currentAlt+=gain[i];
			highestAlt = Math.max(currentAlt, highestAlt);
		}

		return highestAlt;
    }
}
