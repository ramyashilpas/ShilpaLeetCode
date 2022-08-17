package shilpa.leetcode;

public class SortedArrayToBinarySearchTree {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return solve(0,nums.length-1,nums);
    }

    public static TreeNode solve(int left, int right, int[] arr) {
        //base case
        //If the left pointer crosses right return null;
        if(left>right)return null;
        // as middle of the array will be the root node
        int mid=left+(right-left)/2;
        TreeNode node=new TreeNode(arr[mid]);
        //left part from middle will be left subtree
        node.left=solve(left,mid-1,arr);
        //right part of array will be right subtree
        node.right=solve(mid+1,right,arr);
        return node;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{-10,-3,0,5,9};
        TreeNode curr=SortedArrayToBinarySearchTree.sortedArrayToBST(arr);
        TreeNode currLeft=curr.left;
        TreeNode currRight=curr.right;
        System.out.println(curr.val);
        System.out.println(curr.left==null?"null":curr.left.val);
        System.out.println(curr.right==null?"null":curr.right.val);
        System.out.println(currLeft.left==null?"null":currLeft.left);
        System.out.println(currLeft.right==null?"null":currLeft.right.val);
        System.out.println(currRight.left==null?"null":currRight.left);
        System.out.println(currRight.right==null?"null":currRight.right.val);

    }
}
