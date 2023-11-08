class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int minTime=0;
        if(fx==sx && fy==sy && t==1)
        return false;
        if(fy!=sy && sx!=fx)
        minTime =Math.abs(Math.abs(fy-sy)+Math.abs(fx-sx) - Math.min(Math.abs(fy-sy),Math.abs(fx-sx)));
        else 
        minTime =Math.abs(fy-sy)+Math.abs(fx-sx);
        System.out.println(minTime);
        return minTime <=t;
    }
}