// Optimal - 2 Pointer Approach
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        // Moving all the non-zeros to front!!
        for (int j = 0; j < n; j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }

        // To fill the remaining elems in array = 0
        while (i < n) {
            nums[i] = 0;
            i++;
        }
    }
}