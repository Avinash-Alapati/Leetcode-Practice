class Solution {
    int findFib(int n){
        if (n <= 1){
            return n;
        }
        int  last = findFib(n - 1);
        int secLast = findFib(n - 2);

        return  last + secLast; 
    }
    public int fib(int n) {
       return findFib(n);
    }
}