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
    int count = 0;
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;
	countGoodNodes(root, root.val);
	// System.gc();
        return count;
    }

    public void countGoodNodes(TreeNode root, int maxVal){

		if(root == null) return;
		if(root.val >= maxVal){
			count++;
			maxVal = Math.max(maxVal, root.val);
		}
		countGoodNodes(root.left, maxVal);
		countGoodNodes(root.right, maxVal);
		return;
	}
}
