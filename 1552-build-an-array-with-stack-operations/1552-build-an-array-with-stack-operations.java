class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        int stackN = 1;

        for ( int num : target ){
            if(num == stackN){
                res.add("Push");
                stackN ++; 
            }
            else{
                int diff = num - stackN;
                for(int i=0;i < diff ; i++)
                {
                    res.add("Push");
                    res.add("Pop");
                }
                res.add("Push");
                stackN +=diff+1;
            }
        }
        return res; 
    }
}