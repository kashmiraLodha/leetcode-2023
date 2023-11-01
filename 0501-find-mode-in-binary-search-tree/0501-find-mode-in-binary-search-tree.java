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
    int maxCount=1;
    Map<Integer,Integer>map=new HashMap<>();
    public int[] findMode(TreeNode root) {
        List<Integer> temp = new ArrayList<>();
        traverse(root);
        for(int key : map.keySet()){
            if(map.get(key)==maxCount)
            temp.add(key);

        }
        int[] result = new int[temp.size()];
        for(int i=0;i<result.length;i++)
        result[i]=temp.get(i);
        return result;
        

        
    }
    public void traverse(TreeNode root){
        if(root==null)
        return;

        //add to hashmap
        if(map.containsKey(root.val)) 
        map.put(root.val, map.get(root.val)+1);
        else
        map.put(root.val,1);
        
        if(map.get(root.val)>maxCount)
        maxCount = map.get(root.val);

        traverse(root.left);
        traverse(root.right);
    }
}