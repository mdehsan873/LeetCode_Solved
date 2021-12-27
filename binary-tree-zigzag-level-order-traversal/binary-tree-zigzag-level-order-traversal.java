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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        Stack<TreeNode>st=new Stack<>();
         Stack<TreeNode>st1=new Stack<>();
       
 
        List<List<Integer>>ans=new LinkedList<>();
        if(root==null)
            return ans;
         st.add(root);
        while(!st.isEmpty()||!st.isEmpty())
        {
           while(!st.isEmpty())
           {
               List<Integer>curr=new LinkedList<>();
               int size=st.size();
               for(int i=0;i<size;i++)
               {
                   TreeNode node=st.pop();
                   curr.add(node.val);
                   if(node.left!=null)
                       st1.push(node.left);
                   if(node.right!=null)
                       st1.push(node.right);
               }
               ans.add(curr);
               
           }
             while(!st1.isEmpty())
           {
               List<Integer>curr=new LinkedList<>();
               int size=st1.size();
               for(int i=0;i<size;i++)
               {
                   TreeNode node=st1.pop();
                   curr.add(node.val);
                    if(node.right!=null)
                       st.push(node.right);
                   if(node.left!=null)
                       st.push(node.left);
                  
               }
                    ans.add(curr);
               
           }
        }
        return ans;
    }
}