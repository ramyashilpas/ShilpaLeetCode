package shilpa.leetcode;

public class BalancedBinaryTree {
    public static boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        if(Height(root)==-1)  return false;
        return true;
    }
    private static int Height(TreeNode root) {
        if(root==null) return 0;
        int leftHeight=Height(root.left);
        int rightHeight=Height(root.right);
        // In case of left subtree or right subtree unbalanced, return -1...
        if(leftHeight==-1||rightHeight==-1)return -1;
        // If their heights differ by more than ‘1’, return -1...
        if(Math.abs(leftHeight-rightHeight)>1)return -1;
        // Otherwise, return the height of this subtree as max(leftHeight, rightHeight) + 1...
        return Math.max(leftHeight,rightHeight)+1;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(3,new TreeNode(9,null,null),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
       Boolean b= BalancedBinaryTree.isBalanced(root);
        System.out.println(b);
    }
}
