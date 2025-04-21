class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
	    Stack<StringBuilder> stringStack = new Stack<>();
	    StringBuilder curr = new StringBuilder();
	    int num = 0;

	    for (char ch : s.toCharArray()) {
	        if (Character.isDigit(ch)) {
	        	 // Build number if multi-digit
	            num = num * 10 + (ch - '0');
	        } else if (ch == '[') {
	        	// Update Count and String stack alongwith restting current String and num
	            countStack.push(num);
	            stringStack.push(curr);
	            curr = new StringBuilder();
	            num = 0;
	        } else if (ch == ']') {
	        	// Making iterations for multiplication of bracket contained String
	        	// Update current String
	            int count = countStack.pop();
	            StringBuilder temp = stringStack.pop();
	            while (count-- > 0) {
	                temp.append(curr);
	            }
	            curr = temp;
	        } else {
	        	// Concatenating string present inside bracket
	            curr.append(ch);
	        }
	    }
	    return curr.toString();
    }
}
