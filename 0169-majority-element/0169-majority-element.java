class Solution {
    public int majorityElement(int[] nums) {
        // return bruteSolution(nums);
        // return betterSolution(nums);
        return optimalSolution(nums);
    }

    public int bruteSolution(int[] nums){
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if (nums[i] == nums[j]){
                    count++;
                }
                if (count > n/2){
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public int betterSolution(int[] nums) {
        HashMap<Integer , Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i])){
                mp.put(nums[i] , mp.get(nums[i]) + 1);
            } else {
                mp.put(nums[i] , 1);
            }
        }

        for (int key : mp.keySet()){
            if(mp.get(key) > nums.length/2){
                return key;
            }
        }
        return -1;  // Technically it will never reach here !!!
    }

    public int optimalSolution(int[] nums){ // Moore's Voting Algorithm
        int count = 0;
        int elem = 0;

        for (int i = 0; i < nums.length; i++){
            if (count == 0){
                elem = nums[i];
                count++;
            }
            else if (nums[i] == elem){
                count++;
            } else {
                count--;
            }
        }
        int counter = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == elem) counter++;
            if (counter > nums.length / 2) return elem;
        }
        return -1;
    }
}