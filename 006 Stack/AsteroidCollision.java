class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // Optimal approach using int array applying stack like operations
		int[] st = new int[asteroids.length];
		int top = 0;
		for (int asteroid : asteroids) {

			boolean alive =true;

			while(top>0 && asteroid<0 && st[top-1]>0){

				if(st[top-1] < -asteroid){
					// incoming asteroid destroys the top one
					top--;
				} else if (st[top-1] == -asteroid){
					// both destroyed
					top--;
					alive = false;
					break;

				} else{
					// stack top is larger, current is destroyed
                	alive = false;
                	break;
				}
			}
			if(alive){
				st[top++]=asteroid;

			}
		}
		int[] result = new int[top];
		// returning new copy of Array using System.arraycopy(original, startOfOriginal, sliced, startOfSliced, numberOfElems);
    	System.arraycopy(st, 0, result, 0, top);
        // Uncomment the line below to suggest immediate memory cleanup.
        // System.gc();
        // It may significantly reduce space usage (beats 99%) at the cost of slight time overhead (drops from 100% to 96%).
        // Note: System.gc() only *suggests* garbage collection and is not guaranteed to run immediately.
        
		return result;
    }
}
