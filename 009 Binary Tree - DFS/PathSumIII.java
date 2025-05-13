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
    public int pathSum(TreeNode root, int targetSum) {
        // Map to store: prefixSum -> number of ways to get this sum
	    Map<Long, Integer> prefixSumCount = new HashMap<>();
	    prefixSumCount.put(0L, 1);  // Base case: one way to reach sum 0

	    return countPaths(root, 0, (long)targetSum, prefixSumCount);
	}

	public static int countPaths(TreeNode node, long currentSum, long targetSum, Map<Long, Integer> prefixSumCount) {
	    if (node == null) return 0;

	    // Add current node's value to the running sum
	    currentSum += node.val;

	    // Count how many times we've seen currentSum - targetSum before
	    int pathsFromAncestor = prefixSumCount.getOrDefault(currentSum - targetSum, 0);

	    // Update map with the current running sum
	    prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);

	    // Recurse left and right to count valid paths in subtrees
	    int totalPaths = pathsFromAncestor
	                   + countPaths(node.left, currentSum, targetSum, prefixSumCount)
	                   + countPaths(node.right, currentSum, targetSum, prefixSumCount);

	    // Backtrack: remove current sum count before going back to parent node
	    prefixSumCount.put(currentSum, prefixSumCount.get(currentSum) - 1);

	    return totalPaths;
	}
}
