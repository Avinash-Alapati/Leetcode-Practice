// BruteForce - TC -> N log N + N , SC -> O(n)
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        Set<Integer> isUnique = new TreeSet<>();

        for (int i = 0; i < n; i++){
            isUnique.add(nums[i]);
        }

        int idx = 0;
        for (int val : isUnique){
            nums[idx] = val;
            idx++;
        }
        return idx;
    }
}