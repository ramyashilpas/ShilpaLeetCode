package shilpa.leetcode;



public class SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        return root==null || isSymmetricHelp(root.left,root.right);
    }

    private static boolean isSymmetricHelp(TreeNode left, TreeNode right) {
     if(left==null||right==null)
        return left==right;
     if(left.val!=right.val)
         return false;
     return isSymmetricHelp(left.left,right.right)&&isSymmetricHelp(left.right,right.left);

    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1,new TreeNode(2,new TreeNode(3),new TreeNode(4)),new TreeNode(2,new TreeNode(4),new TreeNode(3)));
       boolean b=SymmetricTree.isSymmetric(root);
        System.out.println(b);
    }
}
