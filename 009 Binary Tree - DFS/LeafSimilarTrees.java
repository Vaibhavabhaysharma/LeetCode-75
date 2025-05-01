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
    public static void ChildVal(TreeNode root, List<Integer> list){

		if(root == null) return;

		// leaf node found
		if(root.left == null && root.right == null){
			// add leaf node into the list
			list.add(root.val);
			return;
		}

		ChildVal(root.left, list);
		ChildVal(root.right, list);
	}

	public static boolean leafSimilar(TreeNode root1, TreeNode root2){

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		// leaf nodes list formation for first tree
		ChildVal(root1, list1);
		// leaf nodes list formation for second tree
		ChildVal(root2, list2);

		// if list does not contain same number of leaf nodes
		if(list1.size() != list2.size()){
			// given two trees are not leaf similar
			return false;	
		}

		// Comparison of similar leaf nodes for both trees
		for (int i =0 ; i<list1.size(); i++) {
			if(!list1.get(i).equals(list2.get(i))){
				// given two trees are not leaf similar
				return false;
			}
		}
		
		// given two trees are leaf similar
		return true;
	}
}
