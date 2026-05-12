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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if( p == null && q == null ){return true;}
        if(p == null || q == null){return false;}

        Queue<TreeNode> q1 = new LinkedList<>();
         Queue<TreeNode> q2 = new LinkedList<>();
         q1.add(p);
        q2.add(q);
         while(!q1.isEmpty()&& !q2.isEmpty()){
            TreeNode n1 = q1.remove();
            TreeNode n2 = q2.remove();

            if(n1.val != n2.val){return false;}
            if(n1.left != null && n2.left !=null){
                q1.add(n1.left);
                q2.add(n2.left);

            }else if(n1.left != null || n2.left != null){
                return false;
            }

             if(n1.right != null && n2.right !=null){
                q1.add(n1.right);
                q2.add(n2.right);

            }else if(n1.right != null || n2.right != null){
                return false;
            }
         }
         return q1.isEmpty()&& q2.isEmpty();
    }

}

    
    