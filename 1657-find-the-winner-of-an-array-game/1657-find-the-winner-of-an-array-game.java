class Solution {
    public int getWinner(int[] arr, int k) {
        int winner = arr[0]>arr[1] ? arr[0] : arr[1];
        int winnerCount=1;
        if(winnerCount==k)
            return winner;
        for(int i =2;i<arr.length;i++ ){
            if(arr[i]>winner){
                winner = arr[i];
                winnerCount=1;
            }
            else
            {
                winnerCount ++;
            }
            if(winnerCount==k)
            return winner;
        }
        return winner;
    }
}