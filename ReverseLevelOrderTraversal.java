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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if ( root == null) return res;
        List<Integer> arr1 = new ArrayList<Integer>();
        
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        Stack<List> s = new Stack<List>();
        q.offer(root);
        q.offer(null);
        
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            
            if(temp!=null){
                if(temp.left != null) {
                    q.offer(temp.left);
                } 
                if(temp.right != null) {
                    q.offer(temp.right);
                }
                arr1.add(temp.val);
            } else {
                List<Integer> arr2 = new ArrayList<Integer>(arr1);
                s.push(arr2);
                arr1.clear();
                
                if(!q.isEmpty()){
                    q.offer(null);
                }
            }
        }
        
        while(!s.isEmpty()){
            res.add(s.pop());
        }
        
        return res;
    }
}