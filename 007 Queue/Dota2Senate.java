class Solution {
    public String predictPartyVictory(String senate) {
        return electionResult(senate.toCharArray(), senate.length(), 0);
    
    }
    private String electionResult(char[] partyMembers, int length, int count) {
		int index = 0;
		for(int i = 0; i<length; i++){
			if(partyMembers[i] == 'R'){
				if(count>=0){
					//  Radiant party candidate allowed to vote
					partyMembers[index++] = 'R'; 
				}
				count++;
			} else {
				if(count<=0){
					//  Dire party candidate  allowed to vote
					partyMembers[index++] = 'D';
				} 
				count--;
			}
		}

		if(Math.abs(count)>= index){
			return (count>0)?"Radiant":"Dire";
		}			

        // Next voting round call with remaining members
		return electionResult(partyMembers, index, count);
    }
}
