/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int best = 0;
    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;

		zigZagPath(root.left, 1, false); // Going left, so next should be right
		zigZagPath(root.right, 1, true); // Going right, so next should be left

		return best;

	}

	public void zigZagPath(TreeNode root, int count, boolean expectLeft){
		
		if(root == null)return;
		
		best = Math.max(best, count);

		if(expectLeft){
			zigZagPath(root.left, count+1, false); // continue zigzag
			zigZagPath(root.right, 1, true);	   // break zigzag, restart
		}else{
			zigZagPath(root.right, count+1, true); // continue zigzag
			zigZagPath(root.left, 1, false);       // break zigzag, restart
			
		}
	}
}
