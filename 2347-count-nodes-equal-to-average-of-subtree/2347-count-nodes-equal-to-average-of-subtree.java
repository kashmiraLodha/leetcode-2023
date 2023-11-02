/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count=0;
    int sum=0;
    int numberOfElements=0;

    public int averageOfSubtree(TreeNode root) {
        traverse(root);
        return count;
    }
    public void traverse(TreeNode root){
        if(root==null)return;
        sum=0;
        numberOfElements=0;
        traverseForAverage(root);
        if(root.val==(sum/numberOfElements))
        count++;
        traverse(root.left);
        traverse(root.right);
    }
    public void traverseForAverage(TreeNode root){
        if(root==null)return;
        traverseForAverage(root.left);
        sum+=root.val;
        numberOfElements++;
        traverseForAverage(root.right);
    }

    

}