class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        int temp = org;
        int rev = 0;
        while (temp > 0) {
            int last = temp % 10;
            rev = rev * 10 + last;
            temp = temp / 10;
        } 

        if (org < 0) {
            rev = (-1 * rev);
        }
        return org == rev;
    }
}