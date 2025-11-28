// Right Rotate an Array by K Places 
class Solution {
    public void rotate(int[] nums, int k) {
        // BruteForce
        int n = nums.length;
        k = k % n;
        int temp[] = new int[k];
        
        // if (k == 0 || k == n) no rotation needed

        // Copy the Kth Elements
        for (int i = n - k; i < n; i++){
            temp[i - (n - k)] = nums[i];
        }

        // Moving the remaining elem according to rotation
        for (int i = n - k - 1; i >= 0; i--){
            nums[i + k] = nums[i];
        }
        
        // Keeping back the temp elements to array!!
        for (int i = 0; i < k; i++){
            nums[i] = temp[i];
        }
    }
}