class Solution {
    public int climbStairs(int n) {
        double solu =
            (Math.pow((1+Math.sqrt(5))/2, n+1)  -  Math.pow((1-Math.sqrt(5))/2, n+1) ) / Math.sqrt(5);
        int intisolu = (int) solu;
        return intisolu;
    }
}