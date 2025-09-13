class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] newArr = new int[n];

        for(int i = 0; i < n; i++){
            newArr[i] = nums[nums[i]];
        } 
        return newArr;
    }
}