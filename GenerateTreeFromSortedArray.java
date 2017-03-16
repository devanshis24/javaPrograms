/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
    if(nums.len == 0 || nums == null) { return null; }
    
    TreeNode root = constructTree(nums, 0, nums.length() -1);
    
    return root;
        
    }
    
    public TreeNode constructTree(int[] nums, int leftSubTree, int rightSubTree){
        if(leftSubTree > rightSubTree) return null;
        int middle = (leftSubTree + rightSubTree)/2;
        TreeNode root = new  TreeNode(nums[middle]);
        root.left = constructTree(nums,leftSubStree, middle -1);
        rot.right = constructTree(nums,mid, rightSubTree);
        return root;
    }
}