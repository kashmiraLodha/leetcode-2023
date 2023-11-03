class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res=new ArrayList<>();
        int stackN = 1;

        for ( int num : target ){
            while (stackN < num) {
                res.add("Push");
                res.add("Pop");
                stackN++;
            }

        res.add("Push");   
        stackN ++; 
        }
        return res; 
    }
}