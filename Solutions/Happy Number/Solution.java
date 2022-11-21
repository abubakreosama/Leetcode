class Solution {
    public boolean isHappy(int n) {
        int sum = getSum(n);
        if (sum == 1){
            return true;
        }
        if (sum == 2 || sum == 4){
            return false;
        }
        else{
            return isHappy(sum);
        }
    }
    public int getSum(int x){
        int sum = 0;
        while (x > 0){
            int y = x%10;
            sum+= y*y;
            x = x/10;
        }
        return sum;
    }
}