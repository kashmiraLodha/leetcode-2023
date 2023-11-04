class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {

        int leftIndex=0;
        int rightIndex=n;
        int max = Integer.MIN_VALUE;
        for(int i : left){
            if(i>max)
            max=i;
        }
        int min = Integer.MAX_VALUE;
        for(int i : right){
            if(i<min)
            min = i;
        } 

        int tLeft = max - 0;
        int tRight = n-min;
        return Math.max(tLeft , tRight);
       
    }
}