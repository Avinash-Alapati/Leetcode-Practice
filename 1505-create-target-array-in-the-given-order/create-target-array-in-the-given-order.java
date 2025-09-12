class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        ArrayList<Integer> newArr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            newArr.add(index[i] , nums[i]);
        }


        int[] Target = new int[n];
        for(int i = 0; i < n; i++){
            Target[i] = newArr.get(i);
        }

        return Target;
    }
}