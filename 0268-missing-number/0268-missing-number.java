class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length + 1;

        for (int i = 1; i < n; i++){
            boolean found = false;
            for (int j = 0; j < n - 1; j++){
                if (nums[j] == i){
                    found = true;
                    break;
                }
            }
            if (!found){
                return i;
            }
        }
        return 0;
    }
}