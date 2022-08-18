package shilpa.leetcode;

public class PathSum {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null )
            return false;

        if(root.left == null && root.right == null)
            return (root.val == targetSum);

        targetSum-=root.val;
        boolean left= hasPathSum(root.left,targetSum);
        boolean right=hasPathSum(root.right,targetSum);
        return left || right;
        /*// If the tree is empty i.e. root is NULL, return false...
        if(root==null)return false;
        // If there is only a single root node and the value of root node is equal to the targetSum...
        if((root.val==targetSum)&& (root.left == null && root.right == null))return true;
        // Call the same function recursively for left and right subtree...
        return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);*/
    }
    public static void main(String[] args) {
        //TreeNode root=new TreeNode(1,new TreeNode(2),new TreeNode(3));
        //[5,4,8,11,null,13,4,7,2,null,null,null,1]
        TreeNode root=new TreeNode(5,new TreeNode(4,new TreeNode(11,new TreeNode(7),new TreeNode(2)),null),new TreeNode(8,new TreeNode(13),new TreeNode(4,null,new TreeNode(1))));
        int targetSum=22;
        Boolean b=PathSum.hasPathSum(root,targetSum);
        System.out.println(b);
    }
}
