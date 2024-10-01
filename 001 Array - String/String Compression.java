class Solution {
    public int compress(char[] chars) {
        // current position in compressed array
		int ans=0;
		
		for (int i = 0; i < chars.length;) {
			final char letter = chars[i]; // current character
			int count = 0; // count of consecutive occurrences of letter

			// count consecutive occurrences of letter in array
			while (i < chars.length && chars[i] == letter) {
				++count;
				++i;
			}

			// write letter to compressed array
			chars[ans++] = letter;

			// if count is greate than 1, write count as string to compressed array
			if(count>1){
				// convert count to string and iterate over each while inserting
				for (final char c: String.valueOf(count).toCharArray()) {
					chars[ans++] = c;
				}
			}
		}
		return ans;
    }
}
