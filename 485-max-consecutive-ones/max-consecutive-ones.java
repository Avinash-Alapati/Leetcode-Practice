class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int freq = 0;
        for (int i =0; i < n; i++){
            if (nums[i] != 0){
                count += 1;
            }
            freq = Math.max(count , freq);
            if (nums[i] == 0){
                count = 0;
            }
        }
        return freq;
    }
}