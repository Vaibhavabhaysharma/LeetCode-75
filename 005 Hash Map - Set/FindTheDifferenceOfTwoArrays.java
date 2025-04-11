class Solution {
    public List<List<Integer>> findDifference(int[] n1, int[] n2) {
        boolean[] existsInN1 = new boolean[2001];
		boolean[] existsInN2 = new boolean[2001];

		for(int num: n1){
			existsInN1[num+1000] = true;
		}

		for(int num: n2){
			existsInN2[num+1000] = true;
		}

		List<List<Integer>> result = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		for(int i =0; i<2001;i++){
			if(existsInN1[i] && !existsInN2[i]){
				list1.add(i-1000);
			}
			if(!existsInN1[i] && existsInN2[i]){
				list2.add(i-1000);
			}

		}
		result.add(list1);
		result.add(list2);

		return result;
    }
}
