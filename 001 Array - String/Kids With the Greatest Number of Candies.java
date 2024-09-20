class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            
             int maximum=0;

        for(int i=0;i<candies.length;i++)
		    {
		        if(candies[i]>maximum)
		        {
		            maximum=candies[i];
		        }
		    }

        List<Boolean> list = new ArrayList<Boolean>();

        for(int i=0;i<candies.length;i++)
		  {
		      if(candies[i]+extraCandies>=maximum)
		      {
		          list.add(true);
		      }
		      else
		      {
		          list.add(false);
		      }
		  }
		return list;  


        }
}
