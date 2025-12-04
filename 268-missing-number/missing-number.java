class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int supposedSum = 0;
        int actualSum = 0;
        for (int i =0; i <= n; i++){
            actualSum += i;
        }
        for (int i = 0; i < n; i++){
            supposedSum += nums[i];
        }
        int ans = actualSum - supposedSum;
        return ans;
    }
}