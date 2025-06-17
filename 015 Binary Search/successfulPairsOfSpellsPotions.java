class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
      Arrays.sort(potions);
        int[] answer = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            int spell = spells[i];

            long minPotion = (success + spell - 1) / spell;

            int index = lowerBound(potions, minPotion);
            answer[i] = potions.length - index;
        }

        return answer;
	}

	public int lowerBound(int[] potions, long minPotion) {
        int left = 0, right = potions.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (potions[mid] < minPotion) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
