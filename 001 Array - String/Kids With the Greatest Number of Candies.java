class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int maximum =0;

        for(int i : candies)
		    {
		        if(i>maximum)
		            maximum=i;
		    }

        List<Boolean> list = new ArrayList<Boolean>();

        for(int i : candies)
		  {
		    list.add(i+extraCandies>=maximum);
		  }
		return list; 
        }
}
