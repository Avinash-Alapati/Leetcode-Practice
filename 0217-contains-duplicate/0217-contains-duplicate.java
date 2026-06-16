class Solution {
    public boolean containsDuplicate(int[] nums) {
    //    return hashMapMethod(nums);
       return hashSetMethod(nums);

    }

    public boolean hashMapMethod(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer,Integer> elem: mp.entrySet()){
            if(elem.getValue() > 1){
                return true;
            }
        }
        return false;
    }

    public boolean hashSetMethod(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (!seen.add(num)) {
                return true; 
            }
        }
        return false;
    }
}