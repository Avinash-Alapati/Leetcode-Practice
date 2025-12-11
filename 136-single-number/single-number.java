class Solution {
    public int singleNumber(int[] nums) {
    //    return bruteforceSolution(nums); // Linear Search  - Tc --> O(n^2) , Sc --> O()
    //    return betterSolution(nums); // Hashing 
          return optimalSolution(nums); // XOR
    }

    public int bruteforceSolution(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++){
            int nums = arr[i];
            int count = 0;
            for (int j = 0; j < n; j++){
                if(arr[j] == nums){
                    count++;
                }
            }
            if (count == 1) return nums;
        }
        return -1;
    }

    public int betterSolution(int[] arr){
        int n = arr.length;
        int length = 0;

        for (int i = 0; i < n; i++){
            length = Math.max(length , arr[i]);
        }
        int[] hashArr = new int[length + 1];

        for (int i = 0; i < n; i++){
            hashArr[arr[i]]++;
        }

        for (int i = 0; i < n; i++){
            if (hashArr[arr[i]] == 1){
                return arr[i];
            }
        }

        return -1;
    }

    public int optimalSolution(int[] arr){
        int n = arr.length;

        int XOR = 0;
        for (int i = 0; i < n; i++){
            XOR = XOR ^ arr[i];
        }
        return XOR;
    }
}