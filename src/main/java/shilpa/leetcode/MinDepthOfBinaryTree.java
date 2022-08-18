package shilpa.leetcode;

public class MinDepthOfBinaryTree {
    public static int minDepth(TreeNode root) {
      if(root==null)return 0;
      int left=minDepth(root.left);
      int right=minDepth(root.right);
      if(right==0)return Math.abs(left-right)+1;
      if(left==0)return Math.abs(right-left)+1;
      return Math.min(left,right)+1;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(2,null,new TreeNode(3,null,new TreeNode(4,null,new TreeNode(5,null,new TreeNode(6)))));
        int min=MinDepthOfBinaryTree.minDepth(root);
        System.out.println(min);
    }
}
