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
    public static int maxLevelSum(TreeNode root) {

		int maxLevelSum=0;
		int currLevel = 0;
		int maxSum=Integer.MIN_VALUE;
	
    	if(root == null) return maxLevelSum;
        int sum=root.val;

        Queue<TreeNode> nodeQueue = new LinkedList<>();

        nodeQueue.offer(root);
        
        while(!nodeQueue.isEmpty()){

        	int size = nodeQueue.size(); 
       		currLevel++;
        	if(maxSum<sum){
        		maxSum = sum;
        		maxLevelSum = currLevel;
        	}
        	sum=0;
        	for(int i = 0; i< size; i++){
        		TreeNode curr = nodeQueue.poll();

                if(curr.left != null) {
                    nodeQueue.offer(curr.left);
                    sum+=curr.left.val;
                }
                if(curr.right !=null ){
                    nodeQueue.offer(curr.right);
                    sum+=curr.right.val;
                }
        	}
    	}
        return maxLevelSum;
    }
}
