class Solution {
    public int[] twoSum(int[] nums, int target) {
        return bruteforce(nums, target, nums.length);
    }

    public int[] bruteforce(int[] nums , int target , int n){  // TC -> O(N^2)
        int[] result = new int[2];
        for(int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (nums[i] + nums[j] == target){
                    result[0] = j;
                    result[1] = i;
                } 
            }
        }
        return result;
    }
}