class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		for (int i: arr ) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		HashSet<Integer> isUnique = new HashSet<Integer>();
		for (int i : map.values()) {
			if(isUnique.contains(i)){
				return false;
			}
			isUnique.add(i);
		}
		return true;
    }
}
