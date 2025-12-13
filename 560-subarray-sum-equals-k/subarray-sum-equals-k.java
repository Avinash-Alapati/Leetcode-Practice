class Solution {
    public int subarraySum(int[] nums, int k) {
        // return bruteforceSolution(nums , k); // Brute - TC --> O(n^2)
        return betterAndOptimalSolution(nums , k);
    }

    public int bruteforceSolution(int[] arr , int val){
        int count = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for (int j = i; j < n; j++){
                sum += arr[j];
                if (sum == val) count++;
            }
        }
        return count;
    }

    public int betterAndOptimalSolution(int[] nums , int k){
        HashMap<Integer, Integer> prefSumMap = new HashMap<>();

        int sum = 0;
        int count = 0;
        prefSumMap.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int rem = sum - k;

            if (prefSumMap.containsKey(rem)) {
                count += prefSumMap.get(rem);
            }

            prefSumMap.put(sum, prefSumMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}