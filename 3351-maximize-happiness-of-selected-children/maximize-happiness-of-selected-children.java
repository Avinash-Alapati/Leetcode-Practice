class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length;
        long happinessSum = 0;

        for (int i = 0; i < k; i++){
            int value = happiness[n - 1 - i] - i;
            if (value <= 0) break;
            happinessSum += value;
        }
        return happinessSum;
    }
}