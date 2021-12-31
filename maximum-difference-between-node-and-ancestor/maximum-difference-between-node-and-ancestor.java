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
    int min;
    public int maxAncestorDiff(TreeNode root) {
        if(root==null)return 0;
        min=Integer.MIN_VALUE;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode temp=q.poll();
            accentor(root,temp.val);
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
        }
        return min;    
    }
    
    boolean accentor(TreeNode root,int node)
    {
        if(root==null)
            return false;
        if(root.val==node)
            return true;
        if(accentor(root.left,node)||accentor(root.right,node))
        {
            min=Math.max(min,Math.abs(root.val-node));
            return true;
        }
        return false;
    }
}