package shilpa.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    static List<Integer> res;
    public static List<Integer> postorderTraversal(TreeNode root) {
        res=new ArrayList<>();
        postOrder(root);
        return res;
    }

    private static void postOrder(TreeNode root) {
        if(root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        res.add(root.val);
    }

    public static void main(String[] args) {
        TreeNode left=new TreeNode(3);
        TreeNode root= new TreeNode(1,null,new TreeNode(2,left,null));
        List<Integer> l;
        l=  BinaryTreePostorderTraversal.postorderTraversal(root);
        for(int item:l){
            System.out.println(item);
        }
    }
}
