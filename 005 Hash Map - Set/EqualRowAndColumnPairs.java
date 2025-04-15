class Solution {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> presence = new HashMap<>();
		int n = grid.length;
		int result = 0;
		for(int i=0; i<n; i++){
			StringBuilder sb = new StringBuilder();
			for (int j=0; j<n; j++) {
				sb.append(grid[i][j]+',');
			}
			String key = sb.toString();
			presence.put(key, presence.getOrDefault(key,0)+1);
		}
		for(int j=0; j<n; j++){
			StringBuilder sb = new StringBuilder();
			for (int i=0; i<n; i++) {
				sb.append(grid[i][j]+',');
			}
			String key = sb.toString();
			result+= presence.getOrDefault(key,0);
		}
		return result;
    }
}
