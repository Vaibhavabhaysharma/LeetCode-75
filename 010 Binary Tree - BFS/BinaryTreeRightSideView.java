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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightViewNodes = new ArrayList<>();
    
    	if(root == null) return rightViewNodes;

        Queue<TreeNode> nodeQueue = new LinkedList<>();

        nodeQueue.offer(root);

        while(!nodeQueue.isEmpty()){

        	int size = nodeQueue.size();

        	for(int i = 0; i< size; i++){
        		TreeNode curr = nodeQueue.poll();
        		if(i == size-1){
        			rightViewNodes.add(curr.val);
        		}

        	if(curr.left != null) nodeQueue.offer(curr.left);
        	if(curr.right !=null )nodeQueue.offer(curr.right);
        	}
    	}

        return rightViewNodes;
    }
}
