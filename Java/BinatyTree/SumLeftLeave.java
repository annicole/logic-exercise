

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

 Given the root of a binary tree, return the sum of all left leaves.

 Input: root = [3,9,20,null,null,15,7]
Output: 24
Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int res = 0;
        if(root.left != null && root.right != null){
        res = getValueLeft(root.left);
        res = res + getValueLeft(root.right);
        }else{
            return 0;
        }
        System.out.println("res " + res);
        return res;
    }
    
    public int getValueLeft(TreeNode nodeChild){
        System.out.println("nodeChild " + nodeChild.val);
        int leftLeave= 0;
        if(nodeChild.left != null){
            System.out.println("no null " + nodeChild.left.val );
            leftLeave = getValueLeft(nodeChild.left);
        }else{
             System.out.println("null " + nodeChild.val );
            leftLeave= nodeChild.val;
        }
        return leftLeave;
    }
    
}