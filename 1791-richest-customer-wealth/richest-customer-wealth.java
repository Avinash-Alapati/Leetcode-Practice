class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;


        for (int i = 0; i < accounts.length; i++){
            int Count = 0;
            for (int j = 0; j < accounts[i].length; j++){
                Count += accounts[i][j];
            }
            maxWealth = Math.max(Count , maxWealth);
        }
        return maxWealth;
    }
}