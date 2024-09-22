class Solution {
    public String reverseVowels(String s) {
        List<String> vowels = Arrays.asList("a","A","e","E","i","I","o","O","u","U");
     	char[] charArray = s.toCharArray();
        int i = 0, j = charArray.length - 1;

        while (i < j) {
            if (vowels.contains(String.valueOf(charArray[i])) && vowels.contains(String.valueOf(charArray[j]))) {
                // Swap the vowels
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                i++;
                j--;
            } else if (vowels.contains(String.valueOf(charArray[i]))) {
                j--; // Move j back
            } else {
                i++; // Move i forward
            }
        }

        // Convert the character array back to a string
        s = new String(charArray);
     	return s;
    }
}
