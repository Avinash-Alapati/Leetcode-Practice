class Solution {
    public boolean isPalindrome(int x) {
        int copy = x;
        int reversed = 0;

        while (x != 0){
            int lastDigit = x % 10;
            reversed = reversed * 10 + lastDigit;
            x = x / 10;
        }
        if (copy < 0) {
           reversed =  (-1 * reversed);
        }
        if (copy == reversed) {
            return true;
        } else {
            return false;
        }
    }
}