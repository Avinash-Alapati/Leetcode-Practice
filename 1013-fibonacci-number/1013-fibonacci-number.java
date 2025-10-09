class Solution {
    int findFib(int n){
        if (n <= 1){
            return n;
        }

        return findFib(n - 1) + findFib(n - 2);
    }
    public int fib(int n) {
       return findFib(n);
    }
}