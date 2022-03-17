
/*


Given the root of a binary tree, find the maximum value v for which there exist different nodes a and b where v = |a.val - b.val| and a is an ancestor of b.

A node a is an ancestor of b if either: any child of a is equal to b or any child of a is an ancestor of b.

Input: root = [8,3,10,1,6,null,14,null,null,4,7,13]
Output: 7
Explanation: We have various ancestor-node differences, some of which are given below :
|8 - 3| = 5
|3 - 7| = 4
|8 - 1| = 7
|10 - 13| = 3
Among all possible differences, the maximum value of 7 is obtained by |8 - 1| = 7.

*/

class Solution {
    private int maxDiff = Integer.MIN_VALUE;
    
    public int maxAncestorDiff(TreeNode root) {
        dfs(root, root, root);
        return maxDiff;
    }
    
    public void dfs(TreeNode node, TreeNode maxNode, TreeNode minNode) {
        if (node == null) return;
        
        if (node.val > maxNode.val) maxNode = node;
        if (node.val < minNode.val) minNode = node;
        
        maxDiff = Math.max(maxDiff, Math.abs(maxNode.val - minNode.val));
        
        dfs(node.left, maxNode, minNode);
        dfs(node.right, maxNode, minNode);
    }
    
}