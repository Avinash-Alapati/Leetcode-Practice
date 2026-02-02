class Solution {
    public void sortColors(int[] nums) {
        // betterSolution(nums);
        optimalSolution(nums);
    }
    public int[] betterSolution(int nums[]){
        int countOne = 0;
        int countZeros = 0;
        int countTwo = 0;

        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0) countZeros++;
            if(nums[i] == 1) countOne++;
            if(nums[i] == 2) countTwo++;
        }

        for (int i = 0; i < countZeros; i++) {
            nums[i] = 0; 
        }

        for (int i = countZeros; i < countOne + countZeros; i++){
            nums[i] = 1;
        }
        for (int i = countZeros + countOne; i < nums.length; i++){
            nums[i] = 2;
        }

        return nums;
    }

    public int[] optimalSolution(int[] nums){
        // Dutch National Flag Algorithm

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0){
                reverse(nums , low , mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                reverse(nums , mid , high);
                high--;
            }
        }
        return nums;
    }

    public int[] reverse(int[] arr , int left , int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }
}