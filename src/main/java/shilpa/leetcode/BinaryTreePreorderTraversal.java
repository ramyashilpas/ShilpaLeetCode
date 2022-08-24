package shilpa.leetcode;


import java.util.ArrayList;
import java.util.List;


public class BinaryTreePreorderTraversal {
    static List<Integer> res;

    public static List<Integer> preorderTraversal(TreeNode root) {
      /*List<Integer> res=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        if(root==null)return res;
        stack.add(root);
        TreeNode curr;
         while(!(stack.isEmpty())){
             curr=stack.pop();
             res.add(curr.val);
             //Add right then left
             //So that left occurs on top when poping
             if(curr.right!=null){
              stack.add(curr.right);
             }
             if(curr.left!=null){
                 stack.add(curr.left);
             }
         }
        return res;*/
        res = new ArrayList<>();
        preOrder(root);
        return res;
    }

        private static void preOrder(TreeNode root) {
            if(root==null)
                return;
            res.add(root.val);
            preOrder(root.left);
            preOrder(root.right);

        }

    public static void main(String[] args) {
        TreeNode left=new TreeNode(3);
        TreeNode root= new TreeNode(1,null,new TreeNode(2,left,null));
        List<Integer> l;
        l=  BinaryTreePreorderTraversal.preorderTraversal(root);
        for(int item:l){
            System.out.println(item);
        }
    }
}
