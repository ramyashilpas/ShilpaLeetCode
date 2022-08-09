package shilpa.leetcode;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
     List<Integer> res=new ArrayList<>();
     Stack<TreeNode> stack=new Stack<>();
     TreeNode curr=root;
     while((curr!=null)||(!stack.isEmpty())){
         while(curr!=null){
             stack.push(curr);
             curr=curr.left;
         }
         curr=stack.pop();
         res.add(curr.val);
         curr=curr.right;
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
