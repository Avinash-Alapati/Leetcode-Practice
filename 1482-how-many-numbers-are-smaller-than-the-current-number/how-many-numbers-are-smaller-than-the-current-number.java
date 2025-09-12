class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            int count = 0;
            for (int j = 0; j < n; j++){
                if(nums[i] > nums[j]){
                    count += 1;
                }
            }
            result[i] = count;
        }
        return result;
    }
}