package shilpa.leetcode;

import java.util.ArrayList;

import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null)
            return res;

        Stack<TreeNode> S= new Stack<>();

        while(root!=null || !S.isEmpty()) {
            if(root!=null) {
                S.add(root);
                root=root.left;
            }
            else {
                root=S.pop();
                res.add(root.val);
                root=root.right;
            }
        }

        return res;
    }

    public static void main(String[] args) {
         TreeNode left=new TreeNode(3);
        TreeNode root= new TreeNode(1,null,new TreeNode(2,left,null));
        List<Integer> l;
              l=  BinaryTreeInorderTraversal.inorderTraversal(root);
              for(int item:l){
                  System.out.println(item);
              }

    }
}
