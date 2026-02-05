class Solution {
    public int maxSubArray(int[] nums) {
        // return bruteforceSolution(nums);
        // return betterSolution(nums);
        return optimalSolution(nums);
    }

    public int bruteforceSolution(int[] nums){   // Generate all subarrays and find Max Sum
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int sum = 0; 
                for(int k = i; k <= j; k++){
                    sum += nums[k];
                    maxSum = Math.max(sum , maxSum);
                }
            }
        }
        return maxSum;
    }

    public int betterSolution(int[] nums){   // Add elem to sum of previous sub array
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){ 
                sum += nums[j];
                maxSum = Math.max(sum , maxSum);
            }
        }
        return maxSum;
    }

    public int optimalSolution(int[] nums){
        int sum = 0; 
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(sum > maxSum) maxSum = sum;
            if (sum < 0) sum = 0;
        }
        return maxSum;
    }
}