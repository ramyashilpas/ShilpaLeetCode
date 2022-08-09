package shilpa.leetcode;

public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {

             if(p==null&&q==null)return true;
             if(p==null||q==null)return false;
             if(p.val!=q.val)return false;

        return isSameTree(p.left,q.left) &&isSameTree(p.right,q.right);
    }



    public static void main(String[] args) {
        TreeNode p=new TreeNode(1,new TreeNode(2),new TreeNode(3));
        TreeNode q=new TreeNode(1,new TreeNode(2),new TreeNode(3));
       boolean sameTree = SameTree.isSameTree(p, q);
        System.out.println(sameTree);
    }
}
