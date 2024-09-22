class Solution {
   public static String reverseVowels(String s) {
		List<String> vowels = Arrays.asList("a","A","e","E","i","I","o","O","u","U");
     	char[] charArray = s.toCharArray();
        int i = 0, j = charArray.length - 1;

        while (i < j) {
            if (isVowel(charArray[i]) && isVowel(charArray[j])) {
                // Swap the vowels
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                i++;
                j--;
            } else if (isVowel(charArray[i])) {
                j--; // Move j back
            } else {
                i++; // Move i forward
            }
        }

        // Convert the character array back to a string
        s = new String(charArray);
     	return s;   
    }


    public static boolean isVowel(char y){
        if(y == 'a' || y == 'e' || y == 'i' || y == 'o'
            || y == 'u' || y == 'A' || y == 'E' || y == 'I'
            || y == 'O' || y == 'U'){
                return true;
            }
        return false;
    }
}
