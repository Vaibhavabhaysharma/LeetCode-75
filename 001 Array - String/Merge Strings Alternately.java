class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedWord=new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int maxlength = Math.max(len1,len2);

        for(int i =0; i<=maxlength ; i++){

        	if(i<len1){
        		mergedWord.append(word1.charAt(i));
        	}

        	if(i<len2){
        		mergedWord.append(word2.charAt(i));
        	}

        }

        return mergedWord.toString();

    }
}
