class Solution {
    public int maxVowels(String s, int k) {
        char[] chars = s.toCharArray();
        int[] isVowel = new int[128];

        isVowel['a'] = 1;
        isVowel['e'] = 1;
        isVowel['i'] = 1;
        isVowel['o'] = 1;
        isVowel['u'] = 1;

        int count = 0, max = 0;

        for (int i = 0; i < k; i++) {
            count += isVowel[chars[i]];
        }
        max = count;

        for (int i = k; i < chars.length; i++) {
            count += isVowel[chars[i]] - isVowel[chars[i - k]];
            if (count > max) max = count;
            if (max == k) return k;
        }

        return max;
    }
}
