class Solution {
    public boolean isSubsequence(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        int j=0;
        boolean flag = false;
        if(len1<1){
        	return true;
        }
        else{
	        for (int i=0; i<len2;i++) {
	        	if(t.charAt(i) == s.charAt(j)){
	        		j++;
	        		if(j>=len1){
	        			return true;
	        		}
	        	}
	        }
	    }
        return flag;
    }
}
