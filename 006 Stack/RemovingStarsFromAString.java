class Solution {
    public String removeStars(String s) {
        // Optimal but without stack approach
		StringBuilder sb = new StringBuilder();
		int flag =0 ;
		for (int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i) == '*'){
				// star found for removal from string
				flag++;
			}
			else{	
				if(flag>0){
					// char found for removal from string
					flag--;
				} else{
					// insertion in StringBuilder
					sb.append(s.charAt(i));
				}
				}
		}
        // conversion from StringBuilder to String
		return sb.reverse().toString();
    }
}
