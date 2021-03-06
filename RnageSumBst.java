// Given the root node of a binary search tree, return the sum of values of all nodes with a value in the range [low, high].
// Problem Link: https://leetcode.com/tag/recursion/

class Solution {
    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum=0;
        helper(root,low,high);
        return sum;
    }
    public void helper(TreeNode root, int low, int high){
        if (root.val >=low && root.val<=high){
            sum=sum+root.val;
        }
        if(root.left!=null)
            helper(root.left,low,high);
        if (root.right!=null)
            helper(root.right,low,high);
    }
}
