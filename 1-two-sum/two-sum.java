class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        // return bruteforce(nums , target , n);
        return better(nums , target , n);
    }
    public int[] bruteforce(int[] nums , int target , int n){  // TC -> O(N^2)
        int[] result = new int[2];
        for(int i = 0; i < n; i++){
            int actualSum = 0;
            for (int j = i + 1; j < n; j++){
                if (nums[i] + nums[j] == target){
                    result[0] = j;
                    result[1] = i;
                } 
            }
        }
        return result;
    }
    public int[] better(int[] nums , int target , int n) {
        int[] result = new int[2];
        HashMap<Integer , Integer> mpp = new HashMap<>();

        for(int i = 0; i < n; i++){
            int elem = nums[i];
            int rem = target - elem;

            if(mpp.containsKey(rem)) {
                result[0] = i;
                result[1] = mpp.get(rem);
            }
            mpp.put(nums[i], i);
        }
        return result;
    }
}