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
    HashMap<TreeNode,int[]>map=new HashMap<>();
    public int averageOfSubtree(TreeNode root) {
        traverse(root);
        for (TreeNode key : map.keySet()) {
            int[]value = map.get(key);
            System.out.println(key + " : " + value[0]+" "+value[1]);
        }
        return count;
    }
    public void traverse(TreeNode root){

        if(root==null)
        return;
        traverse(root.left);
        traverse(root.right);
        if(root.left==null && root.right == null){
            int[] tempArr ={root.val,1};
            map.put(root,tempArr);
        }
        else{
            int[] defaultValue = new int[]{0, 0};

           int[] leftSubtree = map.getOrDefault(root.left,defaultValue);
           int[] rightSubtree = map.getOrDefault(root.right,defaultValue);
           int sum = leftSubtree[0]+rightSubtree[0]+root.val;
           int elements = leftSubtree[1]+rightSubtree[1]+1;
            // System.out.println("left "+leftSubtree[0]+" "+leftSubtree[1]);
            // System.out.println("right "+rightSubtree[0]+" "+rightSubtree[1]);
           int[] tempArr ={sum,elements};
           map.put(root,tempArr);
        }
        int [] res = map.get(root);
        // System.out.println("root "+res[0]+" "+res[1]+" "+root.val);
        if((res[0]/res[1])==root.val)
        count++;
    }

}