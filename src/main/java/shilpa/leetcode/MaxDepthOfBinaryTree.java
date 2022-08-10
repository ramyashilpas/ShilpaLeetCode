package shilpa.leetcode;

import com.sun.source.tree.Tree;

public class MaxDepthOfBinaryTree {
    public static int maxDepth(TreeNode root) {
      if(root==null)return 0;
      int left=maxDepth(root.left);
      int right=maxDepth(root.right);
      return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        int i = MaxDepthOfBinaryTree.maxDepth(root);
        System.out.println(i);

    }
}

