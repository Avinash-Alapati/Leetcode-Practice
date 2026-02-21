class Solution {
    public int countPrimeSetBits(int left, int right) {
        // Only primes up to 20 are needed
        Set<Integer> primes = new HashSet<>(
            Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19)
        );

        int count = 0;
        for (int n = left; n <= right; n++) {
            int setBits = Integer.bitCount(n);
            if (primes.contains(setBits)) {
                count++;
            }
        }

        return count;
    }
}